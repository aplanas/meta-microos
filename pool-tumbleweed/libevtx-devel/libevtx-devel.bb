SUMMARY = "Development files for libevtx, a Windows XML Event file parser"
DESCRIPTION = "libevtx is a library to access the Windows XML Event log format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevtx."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx-devel-20221101-3.11.aarch64.rpm"
RPM_HASH = "30ea476f7f416d9b8b4abd6d81fdc870cdec878294dbd7da21585e86e6784f4739bbca26ec51d134ed0feb2eedeb72f4bfe9b7d4e9507475198e172e77b65503"

RPROVIDES:${PN} += "libevtx-devel \
pkgconfig-libevtx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libevtx1"

inherit rpm
