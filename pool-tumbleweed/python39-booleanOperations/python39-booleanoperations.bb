SUMMARY = "Boolean operations on paths"
DESCRIPTION = "Boolean operations on paths."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-booleanOperations-0.9.0-2.9.noarch.rpm"
RPM_HASH = "b2aeab6bae5f8ba5551288a1eb6fe818564572643fc0ef2e59c187e49c54a8a82cf2b65bbb510773f8395df5ede88258cead35a13cba7d2c9a88d05b1f7bdac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-booleanoperations \
python39-booleanOperations \
python3dist-booleanoperations"

RDEPENDS:${PN} += "python-abi \
python39-FontTools \
python39-pyclipper"

inherit rpm
