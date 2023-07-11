SUMMARY = "A neural network intent parser"
DESCRIPTION = "A neural network intent parser used by the Mycroft AI"
LICENSE = "Apache-2.0"

PV = "0.4.8"

RPM_NAME = "python311-padatious-0.4.8-1.6.noarch.rpm"
RPM_HASH = "b88ee2ba75ece8888380ca62c1488f99c6f960cf089d2d56d16450206773af1e4b5038ec0bbd0b677c7c8cee05e7c0319eb1d96f85afaff51c321a97708622e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-padatious \
python3.11dist-padatious \
python311-padatious \
python3dist-padatious"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-fann2 \
python311-padaos \
python311-setuptools \
python311-xxhash \
update-alternatives"

inherit rpm
