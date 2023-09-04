SUMMARY = "Command line utilities for handling DWG file"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains some command line utilities using this library."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5.5907"

RPM_NAME = "libredwg-tools-0.12.5.5907-2.1.aarch64.rpm"
RPM_HASH = "35000d9ba5b126622e5b2812016466d881b33b70c754fc145be55e0185a39a9a170a120616c86db634305fb06caf1f97926e02bf48e206f320d21396c60316cf"

RPROVIDES:${PN} += "libredwg-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libredwg.so.0"

inherit rpm
