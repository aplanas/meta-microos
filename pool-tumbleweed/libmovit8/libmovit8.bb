SUMMARY = "GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the Movit shared library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "libmovit8-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "b1872d4f2e4dcdd8095ce91dedee0b404b6f83055b586db404169cc5900fa4471ef396f921523ea5f2fc2d15204b8782e666147afa1e1f93fe74cb58e3fdfcdd"

RPROVIDES:${PN} += "libmovit.so.8 \
libmovit8 \
movit \
movit8-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
