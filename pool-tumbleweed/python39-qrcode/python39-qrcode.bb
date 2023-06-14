SUMMARY = "QR Code image generator"
DESCRIPTION = "This module uses the Python Imaging Library (PIL) to allow for the generation \
of QR Codes."
LICENSE = "BSD-3-Clause"

PV = "7.3.1"

RPM_NAME = "python39-qrcode-7.3.1-2.7.noarch.rpm"
RPM_HASH = "0cf7cc7c2b4629995fc7ddffd76309801e0a49d1061340983dd92f2aef1628c3ab25d63c8a47325dbf004572da026362ed2c39a87ad818f221c617e72ff69702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qrcode \
python39-qrcode \
python3dist-qrcode"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
