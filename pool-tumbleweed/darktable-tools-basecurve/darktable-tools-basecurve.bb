SUMMARY = "The basecurve tool from tools/basecurve/"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the basecurve tool from tools/basecurve/. \
Another option to solve the same problem might be the darktable-chart module \
from the darktable package."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0"

RPM_NAME = "darktable-tools-basecurve-4.4.0-1.2.aarch64.rpm"
RPM_HASH = "21a2b6b747afc55bd4820682ef3b46fb83a490094b9205d919b5a29a358f5e593ac1787d9c36f6dfd055e26108fcb862906d7a8d59d2d736fe37a7c6cc32f700"

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
