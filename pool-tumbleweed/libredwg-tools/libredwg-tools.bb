SUMMARY = "Command line utilities for handling DWG file"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains some command line utilities using this library."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5.5907"

RPM_NAME = "libredwg-tools-0.12.5.5907-1.1.aarch64.rpm"
RPM_HASH = "2f8606e3583446a1747cce414967aace68f50aeef69f09419cf4b1d4ca26270810e3c9c81eeb51e2a899b22726a7ea070d0317da5e0232b8dc219b97c8d280c4"

RPROVIDES:${PN} += "libredwg-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libredwg.so.0"

inherit rpm
