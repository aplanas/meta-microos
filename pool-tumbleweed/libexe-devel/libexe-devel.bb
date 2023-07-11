SUMMARY = "Development files for libexe"
DESCRIPTION = "Library to provide Microsoft EXE file support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libexe."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe-devel-20210424-4.9.aarch64.rpm"
RPM_HASH = "21a7a54236f1740f10e5e3db6899b7ed8bc02a4f893743ec4d8da50f447e6c36d7bfefce718cc5f167989d34c128ef982f2bad65cb8f26b255057dfe689fee57"

RPROVIDES:${PN} += "libexe-devel \
pkgconfig-libexe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libexe1"

inherit rpm
