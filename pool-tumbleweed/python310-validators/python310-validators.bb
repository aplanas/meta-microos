SUMMARY = "Python Data Validation"
DESCRIPTION = "Python Data Validation for Humans."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python310-validators-0.20.0-3.3.noarch.rpm"
RPM_HASH = "f38b8947168d2ee43ac74309117f0db23a00b20b3fa0f23b004a036dd166ac8a062ccb0496f8d05ac639b59d9221b389ae17e13b493eac8a7fa03a9b534e6e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-validators \
python310-validators \
python3dist-validators"

RDEPENDS:${PN} += "python-abi \
python310-decorator"

inherit rpm
