SUMMARY = "LV2 plugins for librubberband"
DESCRIPTION = "Package rubberband-lv2 contains the rubberband LV2 plugin."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-lv2-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "bcf6eb1a55bc56f66827328d538f9022dc9e854361d0a73954e6048225f85b52c72a509a29fb1b4e6ea6f1c46df24a7bdfaa7192c12971fce24f05656c685897"

RPROVIDES:${PN} += "rubberband-lv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband2 \
libstdc++.so.6"

inherit rpm
