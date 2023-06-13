SUMMARY = "BiDi layout algorithm"
DESCRIPTION = "A pure python implementation of the BiDi layout algorithm."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "python311-python-bidi-0.4.2-3.11.noarch.rpm"
RPM_HASH = "362381d16dee34f52815fed41bd391ecb76a165fde40549752ab8a17325cd9acdc340481d4cfdcf1bc941b3c095dcec5c314295c533f2e1782b12f78accd4093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-bidi) \
python311-python-bidi \
python3dist(python-bidi)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-six \
update-alternatives"

inherit rpm
