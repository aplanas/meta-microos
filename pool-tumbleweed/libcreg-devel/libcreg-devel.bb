SUMMARY = "Development files for libcreg, a Windows 9x/Me REGF-type Registry file parser"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcreg."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-devel-20210625-5.10.aarch64.rpm"
RPM_HASH = "cfa697c96f8a5876552d26b0af62ea66b1f4e12373ab02fc8a4e2024fb5a59aa822d3401d4085cce0e52a3054d3eb2612e823ec2001c3ff0d399439b9beb86cb"

RPROVIDES:${PN} += "libcreg-devel \
pkgconfig-libcreg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libcreg1"

inherit rpm
