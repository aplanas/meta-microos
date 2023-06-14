SUMMARY = "Development Files for applications which will use libvisio2svg"
DESCRIPTION = "The libvisio2svg-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will convert Visio files to SVG."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "libvisio2svg-devel-0.5.5-3.13.aarch64.rpm"
RPM_HASH = "6f6318cb9becf0e234094305563b3e26c37a888065f228f4c15357d5819e478ae9a1c717b6a057eb27e0d393eb22704b2b4c203388328ba5a39be304231c6074"

RPROVIDES:${PN} += "libvisio2svg-devel"

RDEPENDS:${PN} += "libvisio2svg0"

inherit rpm
