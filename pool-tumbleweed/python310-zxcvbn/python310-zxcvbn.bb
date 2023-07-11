SUMMARY = "Python password strength estimator"
DESCRIPTION = "Python password strength estimator."
LICENSE = "MIT"

PV = "4.4.28"

RPM_NAME = "python310-zxcvbn-4.4.28-1.22.noarch.rpm"
RPM_HASH = "888f58161ea78c84d7fd1dd6fdbc6db2d88eaeabc391b1a16ea221c0c996ad19d2099a502c80d1e09e89c25dab73c207b1c702955a9b4c9e3c6357e164f687ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zxcvbn \
python310-zxcvbn \
python3dist-zxcvbn"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
