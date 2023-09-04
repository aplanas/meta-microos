SUMMARY = "Development files for libfwnt"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwnt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "libfwnt-devel-20220922-3.1.aarch64.rpm"
RPM_HASH = "10e41b4a5b90477e1a40b52abac50a2417b42ccfdeb6b0531e98b67f0e8963315ec95ce3a112673ec0f92e8804781c1c7083dd4f74fdf24645aef73bf1f932a1"

RPROVIDES:${PN} += "libfwnt-devel \
pkgconfig-libfwnt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwnt1"

inherit rpm
