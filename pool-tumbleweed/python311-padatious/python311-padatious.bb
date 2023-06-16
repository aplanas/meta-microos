SUMMARY = "A neural network intent parser"
DESCRIPTION = "A neural network intent parser used by the Mycroft AI"
LICENSE = "Apache-2.0"

PV = "0.4.8"

RPM_NAME = "python311-padatious-0.4.8-1.4.noarch.rpm"
RPM_HASH = "72ab83b3830e7de52cd5579a803e385ee8077edb9eef3e63362bb26636b846068d8d07468b97fd905846144009a5067ce5bf1e025bd5b52ce62aac10f57c086e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-padatious \
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
