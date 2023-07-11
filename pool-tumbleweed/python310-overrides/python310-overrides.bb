SUMMARY = "A decorator to automatically detect mismatch when overriding a method"
DESCRIPTION = "A decorator @override that verifies that a method that should override \
an inherited method actually does it. \
 \
Copies the docstring of the inherited method to the overridden method. \
 \
Since signature validation and docstring inheritance are performed on \
class creation and not on class instantiation, this library significantly \
improves the safety and experience of creating class hierarchies in Python \
without significantly impacting performance. \
See https://stackoverflow.com/q/1167617 for the initial inspiration for \
this library."
LICENSE = "Apache-2.0"

PV = "7.3.1"

RPM_NAME = "python310-overrides-7.3.1-1.3.noarch.rpm"
RPM_HASH = "426db8bd4e586450494f3ec78a4f0930c43694c06c44f87de2f061832674b0e8ade8883acddb5d04ce878622533d01a8c7a451fc5a55e6275313f61655ae45a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-overrides \
python310-overrides \
python3dist-overrides"

RDEPENDS:${PN} += "python-abi"

inherit rpm
