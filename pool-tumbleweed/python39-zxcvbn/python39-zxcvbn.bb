SUMMARY = "Python password strength estimator"
DESCRIPTION = "Python password strength estimator."
LICENSE = "MIT"

PV = "4.4.28"

RPM_NAME = "python39-zxcvbn-4.4.28-1.22.noarch.rpm"
RPM_HASH = "345155ac14c704d7a97d0eff4e6cf8b29851c5e7d86593cf3e2ec26838dc77db7870a7a085bb3245a445860ffc3fbbdcc1b24c6193880effb7c828c1285e7a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zxcvbn \
python39-zxcvbn \
python3dist-zxcvbn"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
