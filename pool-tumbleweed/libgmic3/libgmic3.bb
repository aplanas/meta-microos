SUMMARY = "Shared library that belongs to gmic"
DESCRIPTION = "This shared library allows using gmic functionality from other \
programs."
LICENSE = "CECILL-2.1"

PV = "3.3.0"

RPM_NAME = "libgmic3-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "366a68bf4a2671d3318e91b5bc7cc3fb4c321e744afc7742b438b5e4fab4ff11540939347d6cc0519c11dd468e50409df988a9d538e77b49c8a9c9c06bec4d9f"

RPROVIDES:${PN} += "libgmic.so.3 \
libgmic3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libOpenEXR-3-1.so.30 \
libX11.so.6 \
libc.so.6 \
libcurl.so.4 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
