SUMMARY = "A neural network intent parser"
DESCRIPTION = "A neural network intent parser used by the Mycroft AI"
LICENSE = "Apache-2.0"

PV = "0.4.8"

RPM_NAME = "python39-padatious-0.4.8-1.4.noarch.rpm"
RPM_HASH = "4d5173b16cba4aa847ac6c7e0264f7cb6b3c6f68a0a0a68dd6709132bc70dbaa31894f50c84773ad80f2838dbc8679e0b10ebfde5791cf20c69bfe31aa79b9e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(padatious) \
python39-padatious \
python3dist(padatious)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-fann2 \
python39-padaos \
python39-setuptools \
python39-xxhash \
update-alternatives"

inherit rpm
