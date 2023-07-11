SUMMARY = "The system GNU Fortran Compiler"
DESCRIPTION = "The system GNU Fortran Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-fortran-13-1.5.aarch64.rpm"
RPM_HASH = "fbee986ec512e1e57ac7adf62c02f1fd75e94a0fda3e72f9c4172d2db06242c8f14c6aa35be36deb64654ad1bf49164aab17a36153c204e83dd9757eb1075808"

RPROVIDES:${PN} += "gcc-fortran"

RDEPENDS:${PN} += "gcc \
gcc13-fortran"

inherit rpm
