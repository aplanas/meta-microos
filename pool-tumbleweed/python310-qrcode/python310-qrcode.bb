SUMMARY = "QR Code image generator"
DESCRIPTION = "This module uses the Python Imaging Library (PIL) to allow for the generation \
of QR Codes."
LICENSE = "BSD-3-Clause"

PV = "7.3.1"

RPM_NAME = "python310-qrcode-7.3.1-2.9.noarch.rpm"
RPM_HASH = "91bf2dc413dfd71149d86a635956a3153a7465d00dcf0b037565b7b694e754e4027099878708d2341fa59fe62a40479ea8aa4bc91f15bc563ce80d2cd3747e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qrcode \
python310-qrcode \
python3dist-qrcode"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
