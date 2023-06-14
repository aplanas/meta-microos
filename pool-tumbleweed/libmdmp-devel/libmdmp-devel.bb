SUMMARY = "Development files for libmdmp"
DESCRIPTION = "libmdmp is a library to access the Windows Minidump (MDMP) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmdmp."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp-devel-20210420-3.4.aarch64.rpm"
RPM_HASH = "2924111681ab6a651def4616a34e5ef80fd47d5e2ebb508c0d0a184b3a0c2e7d73931c3943cb2b949005222b8ec64aadcb62f471aa267bef1587dc7b4e0c2b6c"

RPROVIDES:${PN} += "libmdmp-devel \
pkgconfig-libmdmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmdmp1"

inherit rpm
