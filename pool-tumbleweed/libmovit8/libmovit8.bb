SUMMARY = "GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the Movit shared library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "libmovit8-1.6.3-1.15.aarch64.rpm"
RPM_HASH = "829f3f779aa871450b624634103d47e724278b9f8c9332741e0f2088711ed8093412b56f08029c29823fe22ad855990d01e8f2988636f72ffe52a3ab4635540d"

RPROVIDES:${PN} += "libmovit.so.8()(64bit) \
libmovit8 \
libmovit8(aarch-64) \
movit"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libepoxy.so.0()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
movit8-data"

inherit rpm
