SUMMARY = "Development files for libqmatrixclient"
DESCRIPTION = "The libqmatrixclient-devel package contains libraries and header files for \
developing applications that use libqmatrixclient."
LICENSE = "LGPL-2.1-only"

PV = "0.5.3.2"

RPM_NAME = "libqmatrixclient-devel-0.5.3.2-1.18.aarch64.rpm"
RPM_HASH = "cbf93f7e7f753eec726cf4a1c722987520d014d640ada6cdcd775c106cf3fc770b241fc44155001fcdee9107572f44da456f65103d57a0fef79b13a00dc1ec74"

RPROVIDES:${PN} += "cmake-QMatrixClient \
libqmatrixclient-devel \
pkgconfig-QMatrixClient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQMatrixClient.so.0.5.3 \
libQMatrixClient0-5-3 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
