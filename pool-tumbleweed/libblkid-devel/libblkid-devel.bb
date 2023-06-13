SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libblkid-devel-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "65cf35727eb1b727929fc978d8473070a0d3ede0194638a98a091cb08c76de1d8824ea81b44f43b4c83065170bac53725ca95ff8f28d07deef489fc93c2fcc62"

RPROVIDES:${PN} += "libblkid-devel \
libblkid-devel(aarch-64) \
pkgconfig(blkid)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblkid1"

inherit rpm
