SUMMARY = "Python password strength estimator"
DESCRIPTION = "Python password strength estimator."
LICENSE = "MIT"

PV = "4.4.28"

RPM_NAME = "python311-zxcvbn-4.4.28-1.22.noarch.rpm"
RPM_HASH = "9861b07fe2f106933a20a9b04aed1dd31dada11c9e32fcc6047427b36ecc78f6ca9382f437814e004b6ffc56f07a31414cd4a3ef9110c603c95ac2e7a4f97cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zxcvbn \
python3.11dist-zxcvbn \
python311-zxcvbn \
python3dist-zxcvbn"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
