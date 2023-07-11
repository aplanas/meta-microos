SUMMARY = "A neural network intent parser"
DESCRIPTION = "A neural network intent parser used by the Mycroft AI"
LICENSE = "Apache-2.0"

PV = "0.4.8"

RPM_NAME = "python39-padatious-0.4.8-1.6.noarch.rpm"
RPM_HASH = "12e0441140e5ebf3880796c1cb4ce9a281a62b0d16e1bd178c46fb682e2aac255951b1654e021d4a1c6ecc0f367b50820fa7a80d950fe053c625591b2182374b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-padatious \
python39-padatious \
python3dist-padatious"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-fann2 \
python39-padaos \
python39-setuptools \
python39-xxhash \
update-alternatives"

inherit rpm
