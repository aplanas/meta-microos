SUMMARY = "A neural network intent parser"
DESCRIPTION = "A neural network intent parser used by the Mycroft AI"
LICENSE = "Apache-2.0"

PV = "0.4.8"

RPM_NAME = "python310-padatious-0.4.8-1.4.noarch.rpm"
RPM_HASH = "3bf2a236041870f19968d29da218b84ba52967b64b9a01a4aa3aeea46a38fb017c9b29f6ab5965af2473e8f583db9318ffc73e4be13d3068ea8a4a211002f006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-padatious \
python3.10dist-padatious \
python310-padatious \
python3dist-padatious"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-fann2 \
python310-padaos \
python310-setuptools \
python310-xxhash \
update-alternatives"

inherit rpm
