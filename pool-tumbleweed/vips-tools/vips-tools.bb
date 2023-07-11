SUMMARY = "Command line tools for VIPS library"
DESCRIPTION = "This package contains command line tools for processing large images using \
the VIPS library."
LICENSE = "LGPL-2.1-only"

PV = "8.14.2"

RPM_NAME = "vips-tools-8.14.2-1.1.aarch64.rpm"
RPM_HASH = "4e7a9fc2cd61175deefb84004bca4b3ee965900dd55e5241cc62c0846082b9304c3ec7db4affe40c28a66a17cad5dd9f9eab24f78c3b862304d16996c1b04da7"

RPROVIDES:${PN} += "vips-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvips.so.42 \
libvips42"

inherit rpm
