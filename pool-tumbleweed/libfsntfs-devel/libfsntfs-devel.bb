SUMMARY = "Development files for libfsntfs"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsntfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs-devel-20230606-1.5.aarch64.rpm"
RPM_HASH = "b9fa7f02a93288aa508e217f054eecd984b0a1a132a878a27ea09e215df926807ca124d0addfb3900b47e42830f9f1e225cf99d2235c8e18987da4a14a7a0e5a"

RPROVIDES:${PN} += "libfsntfs-devel \
pkgconfig-libfsntfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsntfs1"

inherit rpm
