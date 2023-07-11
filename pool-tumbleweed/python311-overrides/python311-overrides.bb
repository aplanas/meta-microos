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

RPM_NAME = "python311-overrides-7.3.1-1.3.noarch.rpm"
RPM_HASH = "a208db15de4666cf8b24d3869dd428dd4a4cae2a9dd8f8501fd90caf14a09c75a58da73eaf57d25bfd24625969d89b4a3707b89b750e357a86e0274f305fd6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-overrides \
python3.11dist-overrides \
python311-overrides \
python3dist-overrides"

RDEPENDS:${PN} += "python-abi"

inherit rpm
