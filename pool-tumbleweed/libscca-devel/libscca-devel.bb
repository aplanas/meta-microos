SUMMARY = "Development files for libscca"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libscca."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "libscca-devel-20230716-1.1.aarch64.rpm"
RPM_HASH = "9bc274cbc565d05ede0cd340e0a59b9d095a19b42fbbdd8c81d2b69488a816f2ec76d7a36fe9e2ef3438a2115ec0f7c34a71a46deb3fe2d8d8c82d976643708c"

RPROVIDES:${PN} += "libscca-devel \
pkgconfig-libscca"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libscca1"

inherit rpm
