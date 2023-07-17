SUMMARY = "Development files for libexe"
DESCRIPTION = "Library to provide Microsoft EXE file support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libexe."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe-devel-20210424-4.10.aarch64.rpm"
RPM_HASH = "93d6b82cf31ee805308c9928630796739b2ebb06e5a9c5c12c2f4557e57223d9e07ee98b7aa496bebae335ee68ea96955bfe31f6b1d1ce39b1e7b4a71a873d8c"

RPROVIDES:${PN} += "libexe-devel \
pkgconfig-libexe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libexe1"

inherit rpm
