SUMMARY = "Development files for libexe"
DESCRIPTION = "Library to provide Microsoft EXE file support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libexe."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe-devel-20210424-5.1.aarch64.rpm"
RPM_HASH = "e0abf09278a02ae59f1fe5a05ed83256f32159d06c41b6f930a4a1e71394ee99c1745c55b956a8d7be8198f1647ca4fbf19fd8dc414138a1e573771a6679f3f8"

RPROVIDES:${PN} += "libexe-devel \
pkgconfig-libexe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libexe1"

inherit rpm
