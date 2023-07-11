SUMMARY = "Development files for libfsrefs"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsrefs."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-devel-20210422-3.5.aarch64.rpm"
RPM_HASH = "80830855a53d1385138d58a3ddf88567c31ca39264199e2cd7952cbaf5fa850a9c6955d5a1293416b44acc41834f37520f89d0ce0f95865ffbff47434f97cac2"

RPROVIDES:${PN} += "libfsrefs-devel \
pkgconfig-libfsrefs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsrefs1"

inherit rpm
