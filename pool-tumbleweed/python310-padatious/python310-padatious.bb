SUMMARY = "A neural network intent parser"
DESCRIPTION = "A neural network intent parser used by the Mycroft AI"
LICENSE = "Apache-2.0"

PV = "0.4.8"

RPM_NAME = "python310-padatious-0.4.8-1.6.noarch.rpm"
RPM_HASH = "d5724539f67c927a2490826419b70f0e46c714aadd3ee6d8970a471b2d9c39c842d0f9eca11dc65436436f771f830d4e33292018b205e9f9974035166b7c3d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-padatious \
python310-padatious \
python3dist-padatious"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-fann2 \
python310-padaos \
python310-setuptools \
python310-xxhash \
update-alternatives"

inherit rpm
