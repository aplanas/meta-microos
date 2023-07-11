SUMMARY = "QR Code image generator"
DESCRIPTION = "This module uses the Python Imaging Library (PIL) to allow for the generation \
of QR Codes."
LICENSE = "BSD-3-Clause"

PV = "7.3.1"

RPM_NAME = "python39-qrcode-7.3.1-2.9.noarch.rpm"
RPM_HASH = "aa7824ab411798bb042f7f8b9fd66f65d436070b3a49431e62780c6005e04c46921070237856a8cfa4fb6c3c942e34d894792f8b3f132e76fdabebb04032b844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qrcode \
python39-qrcode \
python3dist-qrcode"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
