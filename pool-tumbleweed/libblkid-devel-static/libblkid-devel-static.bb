SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libblkid-devel-static-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "a2dc752c519a24563b858ad682be8daf93c80403687750e782e4679b55eeb15a9862537af8bb1b3656d1459a05face6dfd9022aaa15d3afb507937f722b3ead1"

RPROVIDES:${PN} += "libblkid-devel-static"

RDEPENDS:${PN} += "libblkid-devel"

inherit rpm
