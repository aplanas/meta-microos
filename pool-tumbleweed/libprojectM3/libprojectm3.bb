SUMMARY = "Run-time library for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "libprojectM3-3.1.12-1.13.aarch64.rpm"
RPM_HASH = "491618e25847169bf8c309121b8b26fadee1161c923119eb29a8fd775b71269f02ea99ae95a9e671a596ec9915379518b7233e600078781f05e9574f3de84bd6"

RPROVIDES:${PN} += "libprojectM-qt5-3 \
libprojectM.so.3 \
libprojectM3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
