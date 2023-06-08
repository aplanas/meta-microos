SUMMARY = "The system GNU Fortran Compiler"
DESCRIPTION = "The system GNU Fortran Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-fortran-13-1.3.aarch64.rpm"
RPM_HASH = "fabe9ff9d709f27d043c74aaf0d6cad37bfd8940cb142f7097411e18020157c6efd46b2cd116a76f5a60cf1e2f9c261f40ccd892a6f9e83af51ef2255d3e63dc"

RPROVIDES:${PN} += "gcc-fortran gcc-fortran(aarch-64)"
RDEPENDS:${PN} += "gcc gcc13-fortran"

inherit rpm
