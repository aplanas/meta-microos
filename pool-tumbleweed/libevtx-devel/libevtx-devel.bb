SUMMARY = "Development files for libevtx, a Windows XML Event file parser"
DESCRIPTION = "libevtx is a library to access the Windows XML Event log format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevtx."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx-devel-20221101-4.1.aarch64.rpm"
RPM_HASH = "cecf222b5baea08fecb2767f6e98e33972ffe15f14e77515ce1a2a91c158efc946b6b01d2fa9afad70059e5de3fb9672431b76f0a462154ae4cc69b7f2f0824e"

RPROVIDES:${PN} += "libevtx-devel \
pkgconfig-libevtx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libevtx1"

inherit rpm
