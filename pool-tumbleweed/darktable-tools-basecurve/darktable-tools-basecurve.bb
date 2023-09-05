SUMMARY = "The basecurve tool from tools/basecurve/"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the basecurve tool from tools/basecurve/. \
Another option to solve the same problem might be the darktable-chart module \
from the darktable package."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.2"

RPM_NAME = "darktable-tools-basecurve-4.4.2-1.1.aarch64.rpm"
RPM_HASH = "88d2d37c17292ec462bf6cb76e5e65c829bf9890d5bdd9412af44c4953f13d633d9eec226e8092a0263f7073a575fad078ae73a6d1017d6b2f3ade496ed9f022"

RPROVIDES:${PN} += "darktable-tools-basecurve"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/convert \
dcraw \
exiftool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
