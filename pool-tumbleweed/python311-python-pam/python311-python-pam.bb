SUMMARY = "Python PAM module using ctypes, py3/py2"
DESCRIPTION = "Python pam module supporting py3 (and py2)."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "python311-python-pam-1.8.4-1.16.noarch.rpm"
RPM_HASH = "315f6c70f7a15c28e388f20f0315472e204bd74f74b91efac78017f075bf1232e43c0da7e11d4ede1b42add7ba21b53a5cc0f5f6ba7eea89603b856fc3ddeecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pam \
python3.11dist-python-pam \
python311-python-pam \
python3dist-python-pam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
