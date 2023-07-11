SUMMARY = "Development files for libtaginfo"
DESCRIPTION = "The libtaglib development package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking application which will use libtaginfo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "libtaginfo-devel-0.2.1-2.5.aarch64.rpm"
RPM_HASH = "7fde7b55caec6ae2aba35660a0572608b362ba60b7b0d8c4f18a190d8bd19db3595000bddf7a5205929ba1d40b660089fb9548f88c3f593fc98f7c230dcab27c"

RPROVIDES:${PN} += "libtaginfo-devel \
pkgconfig-libtaginfo \
pkgconfig-libtaginfo-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtaginfo-c0 \
libtaginfo1 \
pkgconfig-libtaginfo"

inherit rpm
