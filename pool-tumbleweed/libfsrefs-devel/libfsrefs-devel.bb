SUMMARY = "Development files for libfsrefs"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsrefs."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-devel-20210422-3.6.aarch64.rpm"
RPM_HASH = "8092ca422a37949e6f74d2309bc734744a0a56c661aba15231ac6be952d985d13b65faa335654823e5dc3e30d32a97b4fe02fa4a939ef6b7d654606a29ae4773"

RPROVIDES:${PN} += "libfsrefs-devel \
pkgconfig-libfsrefs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsrefs1"

inherit rpm
