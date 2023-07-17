SUMMARY = "The basecurve tool from tools/basecurve/"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the basecurve tool from tools/basecurve/. \
Another option to solve the same problem might be the darktable-chart module \
from the darktable package."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "darktable-tools-basecurve-4.4.1-1.1.aarch64.rpm"
RPM_HASH = "cb472feb255671d3671580cb2a57b413030fadf62d0199770a495d61eaa8b61611eef20e456d7c88141d925bfb473b022b2f118de7ab3c26205efc1c26060d49"

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
