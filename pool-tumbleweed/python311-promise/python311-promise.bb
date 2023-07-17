SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-promise-2.3.0-5.1.noarch.rpm"
RPM_HASH = "02574c54d9c255983de9ca5f7b58e8df6d954731e53410fa90c303d8046aa150053453176b4980a116ca35ed5d53b2333bacabe472ced614d800cf27548621da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-promise \
python3.11dist-promise \
python311-promise \
python3dist-promise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
