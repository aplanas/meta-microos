SUMMARY = "Python PAM module using ctypes, py3/py2"
DESCRIPTION = "Python pam module supporting py3 (and py2)."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "python311-python-pam-1.8.4-1.15.noarch.rpm"
RPM_HASH = "0c0dab8b46a3862172c0f5f8c35d57395103106012223763cc127b6e3c70a976d34af999992fd3676cf8fd66683904534a53ca8ae73ba3f5002500071c9aba44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-pam \
python311-python-pam \
python3dist-python-pam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
