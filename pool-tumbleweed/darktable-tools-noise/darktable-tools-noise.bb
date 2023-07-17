SUMMARY = "Noise profiling tools to support new cameras"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the noise profiling tools to add support for new cameras."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "darktable-tools-noise-4.4.1-1.1.aarch64.rpm"
RPM_HASH = "d355a3384d21197c69bf23261abea992684ddeb66a0aae20bb2436f302df85c361553b0a7c244591d5c200fa0f9bed09f89a74052e32c46f6489edfb1c3ca27c"

RPROVIDES:${PN} += "darktable-tools-noise"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/convert \
ghostscript \
gnuplot \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
