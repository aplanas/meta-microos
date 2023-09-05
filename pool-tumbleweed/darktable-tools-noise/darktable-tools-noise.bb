SUMMARY = "Noise profiling tools to support new cameras"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the noise profiling tools to add support for new cameras."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.2"

RPM_NAME = "darktable-tools-noise-4.4.2-1.1.aarch64.rpm"
RPM_HASH = "2a55c4db47d32ffd492af04604dd49cd57c7b65131e0aa9ac01327f7e244337e98037164f93b194736bac0a64aead75171f45ecc1463ac80b91f7a54b32f63a8"

RPROVIDES:${PN} += "darktable-tools-noise"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/convert \
ghostscript \
gnuplot \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
