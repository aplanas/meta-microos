SUMMARY = "CUPS library for working with large images"
DESCRIPTION = "The CUPS imaging library provides functions for managing large \
images, doing colorspace conversion and color management, scaling \
images for printing, and managing raster page streams. It is used by \
the CUPS image file filters, the PostScript RIP, and all raster \
printers drivers."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "libcupsimage2-2.4.2-6.1.aarch64.rpm"
RPM_HASH = "c9c7aa72d4b564af1d21e2ccca088190f1797557c7c90474fe701216dc2f9dfe58248310a71ef8898bf00ec6c25f5bf5fbe5df646c3e12aa698b81aaea7c4eee"

RPROVIDES:${PN} += "libcupsimage.so.2 \
libcupsimage2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcups.so.2"

inherit rpm
