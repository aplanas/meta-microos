SUMMARY = "QR Code image generator"
DESCRIPTION = "This module uses the Python Imaging Library (PIL) to allow for the generation \
of QR Codes."
LICENSE = "BSD-3-Clause"

PV = "7.3.1"

RPM_NAME = "python311-qrcode-7.3.1-2.9.noarch.rpm"
RPM_HASH = "66257f105f5f934d372c618c0a72d30bf8421fd8d8afea2ab498bc9bd4a1e7ca99d3dc3640a42cf83c6da66df9fb184365aa313be5da9827c36808327c67df03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qrcode \
python3.11dist-qrcode \
python311-qrcode \
python3dist-qrcode"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
