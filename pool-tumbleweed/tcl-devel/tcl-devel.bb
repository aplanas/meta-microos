SUMMARY = "Header Files and C API Documentation for Tcl"
DESCRIPTION = "This package contains header files and documentation needed for writing \
Tcl extensions in compiled languages like C, C++, etc., or for \
embedding the Tcl interpreter in programs written in such languages. \
 \
This package is not needed for writing extensions or applications in \
the Tcl language itself."
LICENSE = "TCL"

PV = "8.6.13"

RPM_NAME = "tcl-devel-8.6.13-5.2.aarch64.rpm"
RPM_HASH = "84aed51c447ec1cc53f316316375b066482a471450128c337cdd93d599f03be3f681e85ba767e079ed9e616395539c87accfdb2f312353bc388eff124bb42106"

RPROVIDES:${PN} += "itcl-devel \
pkgconfig-tcl \
tcl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-zlib \
tcl"

inherit rpm
