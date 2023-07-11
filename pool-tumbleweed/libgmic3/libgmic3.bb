SUMMARY = "Shared library that belongs to gmic"
DESCRIPTION = "This shared library allows using gmic functionality from other \
programs."
LICENSE = "CECILL-2.1"

PV = "3.2.6"

RPM_NAME = "libgmic3-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "f32c7afef1752831640aee3c6d27ad793c11483a7f8b4b80076107121f783eb3c49b8240096e9ff32324da975d3f5c77f13168d66d5ac9bff179b096089ed0cd"

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
