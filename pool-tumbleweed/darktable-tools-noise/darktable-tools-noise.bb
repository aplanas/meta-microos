SUMMARY = "Noise profiling tools to support new cameras"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the noise profiling tools to add support for new cameras."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "darktable-tools-noise-4.2.1-1.4.aarch64.rpm"
RPM_HASH = "f7b0cc08bd33906626528e3c3beb32a460e8d0b6785956edf85816b99e55f800ea0d681284a4bded51cd6b846455e6a01cf2b54e40f2fc3836e1d4562f33e358"

RPROVIDES:${PN} += "darktable-tools-noise \
darktable-tools-noise(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/convert \
ghostscript \
gnuplot \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
