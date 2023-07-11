SUMMARY = "Development files for libcreg, a Windows 9x/Me REGF-type Registry file parser"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcreg."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-devel-20210625-5.9.aarch64.rpm"
RPM_HASH = "e017dea48c78a753a4e1fcfbe45a0214edd8b9f89c0fd969e0778d0289d145467a6491f6e91964053ea475d2739e975c61954dd065097270bf6a60f9866b7802"

RPROVIDES:${PN} += "libcreg-devel \
pkgconfig-libcreg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libcreg1"

inherit rpm
