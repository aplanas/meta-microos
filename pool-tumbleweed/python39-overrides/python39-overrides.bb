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

RPM_NAME = "python39-overrides-7.3.1-1.3.noarch.rpm"
RPM_HASH = "0af6b469d2744ca9a7b57195a9a06a017fbf715782ea8e6b88592c90def4b4a7acb50bc11233da2d001faeb56a1d2f1896b467b6b1a9add461c3989b202eb914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-overrides \
python39-overrides \
python3dist-overrides"

RDEPENDS:${PN} += "python-abi"

inherit rpm
