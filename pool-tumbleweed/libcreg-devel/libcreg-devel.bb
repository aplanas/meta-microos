SUMMARY = "Development files for libcreg, a Windows 9x/Me REGF-type Registry file parser"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcreg."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-devel-20210625-6.1.aarch64.rpm"
RPM_HASH = "d81b54b5cf70606814d65caab35d5294b2a4fcc4d936265173f8cb77a08209faa6767a8e110ddc9a330195a1c54ed507bca5dba7c2b4309811abac3245254d29"

RPROVIDES:${PN} += "libcreg-devel \
pkgconfig-libcreg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libcreg1"

inherit rpm
