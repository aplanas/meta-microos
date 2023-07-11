SUMMARY = "Development Files for applications which will use libvisio2svg"
DESCRIPTION = "The libvisio2svg-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will convert Visio files to SVG."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "libvisio2svg-devel-0.5.5-3.14.aarch64.rpm"
RPM_HASH = "927973682eb47a725e0b0f10f9ddcd5ac4336b5a22464616700e3e239aa6a6961d2d1437e50514ce49ed37f4d3988f4de94cd60fc280b1f50fb3f9a4a846d1b8"

RPROVIDES:${PN} += "libvisio2svg-devel"

RDEPENDS:${PN} += "libvisio2svg0"

inherit rpm
