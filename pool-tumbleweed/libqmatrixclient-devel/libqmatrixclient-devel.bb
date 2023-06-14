SUMMARY = "Development files for libqmatrixclient"
DESCRIPTION = "The libqmatrixclient-devel package contains libraries and header files for \
developing applications that use libqmatrixclient."
LICENSE = "LGPL-2.1-only"

PV = "0.5.3.2"

RPM_NAME = "libqmatrixclient-devel-0.5.3.2-1.17.aarch64.rpm"
RPM_HASH = "001b6971f738854b502ca94bea03959b0aabc1182fdd3688e4cd4b50bd34cb372f6d0dde700f56c5f970014311ad4b4c3cdc3520c03b6136ec502b3a07d350f2"

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
