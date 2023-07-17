SUMMARY = "Development files for libregf, a Windows REGF-type Registry file parser"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libregf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-devel-20230319-1.6.aarch64.rpm"
RPM_HASH = "585a53ce31194f5f32226ef2321b399e2e162df8b16716ff69f878abfc3fed5d75cb59011e6b119f980c16900ed3c2e073af8163c9713ed6d283d9fe6ff9faad"

RPROVIDES:${PN} += "libregf-devel \
pkgconfig-libregf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libregf1"

inherit rpm
