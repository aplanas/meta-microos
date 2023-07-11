SUMMARY = "Command line tools for openslide"
DESCRIPTION = "This package contains command line tools for working with virtual slides."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "openslide-tools-3.4.1-2.26.aarch64.rpm"
RPM_HASH = "aafeec2e5e2764da91755f8341b9d0839f65709424a01c228ca45b707f0afd4a91d9e543f4fe559a366cd4110db469bd28f6f5bbee920f1eabca353f9202940c"

RPROVIDES:${PN} += "openslide-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libopenslide.so.0 \
libopenslide0 \
libpng16.so.16"

inherit rpm
