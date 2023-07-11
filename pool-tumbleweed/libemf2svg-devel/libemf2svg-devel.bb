SUMMARY = "Development files for applications which will use libemf2svg"
DESCRIPTION = "The libemf2svg-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will convert EMF files to SVG."
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "libemf2svg-devel-1.1.0-2.14.aarch64.rpm"
RPM_HASH = "09cc886da1d46274962617fb8c12e7b665563d7162b896cee10061be6aeb452eedf933b4015e8dc00c86def6de044040e7df30b38a6340ebe74860fc63d5f48a"

RPROVIDES:${PN} += "libemf2svg-devel"

RDEPENDS:${PN} += "libemf2svg1"

inherit rpm
