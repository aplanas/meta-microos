SUMMARY = "Shared library that belongs to gmic"
DESCRIPTION = "This shared library allows using gmic functionality from other \
programs."
LICENSE = "CECILL-2.1"

PV = "3.2.5"

RPM_NAME = "libgmic3-3.2.5-1.1.aarch64.rpm"
RPM_HASH = "aac8fb1983e0cdec606fd3a99725aff0747af6453b4dc6c3a9d907e599baa86cccce34aa908f4cb96e64bf2d29b75f05fcaa2c673965efa385a9131a43300c81"

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
