SUMMARY = "Noise profiling tools to support new cameras"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the noise profiling tools to add support for new cameras."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0"

RPM_NAME = "darktable-tools-noise-4.4.0-1.2.aarch64.rpm"
RPM_HASH = "53244da9c295b13783261a0b5008e9991ca894246eb9a44f8731188941959d5f83fce1dbfb879f9970d06e47a6b459079cad7c9d830961ed2804ff781c5ccd97"

RPROVIDES:${PN} += "darktable-tools-noise"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/convert \
ghostscript \
gnuplot \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
