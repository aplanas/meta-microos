SUMMARY = "Python PAM module using ctypes, py3/py2"
DESCRIPTION = "Python pam module supporting py3 (and py2)."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "python39-python-pam-1.8.4-1.16.noarch.rpm"
RPM_HASH = "11c89424c4ab1b914836d2876c8e64c2f8ba5f5f638a8bd6a471ec722259b595eac6d1fa8aed53f22cfed7237e1daf0f37330838d8dcbfc8ca95d0db0c2972fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-pam \
python39-python-pam \
python3dist-python-pam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
