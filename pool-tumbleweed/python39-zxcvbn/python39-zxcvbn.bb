SUMMARY = "Python password strength estimator"
DESCRIPTION = "Python password strength estimator."
LICENSE = "MIT"

PV = "4.4.28"

RPM_NAME = "python39-zxcvbn-4.4.28-1.20.noarch.rpm"
RPM_HASH = "4cf3f19356088d1825c55b9ddf345df6b64eece6998b45d4d44b702d70b1b21d7c2f9103b58c6998b78d04801482bcf413868a9374efd158771d88df78d346dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zxcvbn \
python39-zxcvbn \
python3dist-zxcvbn"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
