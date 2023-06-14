SUMMARY = "Optical Character Recognition Program"
DESCRIPTION = "GOCR is an optical character recognition program. It reads images in \
many formats and outputs a text file. It is also able to recognize \
and translate barcodes."
LICENSE = "GPL-2.0-or-later"

PV = "0.52"

RPM_NAME = "gocr-0.52-3.2.aarch64.rpm"
RPM_HASH = "ccebbe07af946a083e3583368a7b88309e76d3144b4c6defcc377863067b607245e5cb9a10b5e14d0f174f49504e36a435adce5635d165b30630507162fe9511"

RPROVIDES:${PN} += "gocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetpbm.so.11"

inherit rpm
