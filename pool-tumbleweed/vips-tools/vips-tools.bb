SUMMARY = "Command line tools for VIPS library"
DESCRIPTION = "This package contains command line tools for processing large images using \
the VIPS library."
LICENSE = "LGPL-2.1-only"

PV = "8.13.3"

RPM_NAME = "vips-tools-8.13.3-1.5.aarch64.rpm"
RPM_HASH = "197811ce510d1fda862b9603a2a78d112dda729928e4b6575cf4d7cacdd118ef03a129bae1a2726378742ddb9483e04aded70b094d494bf1efa0e1f144905214"

RPROVIDES:${PN} += "vips-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvips.so.42 \
libvips42"

inherit rpm
