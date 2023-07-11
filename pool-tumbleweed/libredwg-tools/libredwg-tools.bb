SUMMARY = "Command line utilities for handling DWG file"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains some command line utilities using this library."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5"

RPM_NAME = "libredwg-tools-0.12.5-3.5.aarch64.rpm"
RPM_HASH = "5760adcca2411e7b3bc4d5239e10f9da314444c6d1b21fb47d22a9b3c3757792d9c20b64d06058f79e9d2d749c2bb4a9565f06aab4b600c1fdefdc59cb68b53d"

RPROVIDES:${PN} += "libredwg-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libredwg.so.0"

inherit rpm
