SUMMARY = "Development files for applications which will use libemf2svg"
DESCRIPTION = "The libemf2svg-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will convert EMF files to SVG."
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "libemf2svg-devel-1.1.0-2.13.aarch64.rpm"
RPM_HASH = "60b8d6e7d963e4ba630d487963850e3013dd7e73bec7e28b6169484e8544603b51263f313c0aeea0b8a7c1c05eb5c44f12645c24fecc3de2cd45f9842204934c"

RPROVIDES:${PN} += "libemf2svg-devel \
libemf2svg-devel(aarch-64)"

RDEPENDS:${PN} += "libemf2svg1"

inherit rpm
