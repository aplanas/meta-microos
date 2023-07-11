SUMMARY = "Optical Character Recognition Program"
DESCRIPTION = "GOCR is an optical character recognition program. It reads images in \
many formats and outputs a text file. It is also able to recognize \
and translate barcodes."
LICENSE = "GPL-2.0-or-later"

PV = "0.52"

RPM_NAME = "gocr-0.52-3.3.aarch64.rpm"
RPM_HASH = "58e26b56bb81df60c32ab8f8c2bc078c59f0d66845decf764f91a0d64b5ffecc6bcc43bbb39863502b8f8e5c67bb7ace1cd3f9acaf22e242656959c13c985704"

RPROVIDES:${PN} += "gocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetpbm.so.11"

inherit rpm
