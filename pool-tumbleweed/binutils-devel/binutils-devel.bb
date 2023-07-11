SUMMARY = "GNU binutils (BFD development files)"
DESCRIPTION = "This package includes header files and static libraries necessary to \
build programs which use the GNU BFD library, which is part of \
binutils."
LICENSE = "GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-devel-2.40-5.3.aarch64.rpm"
RPM_HASH = "466222f4a76e2c6ee5a079f181f21bd94924d9e9c543eb132407dd104eafd2b88024891c3694ff40351875b2776b25634f5dda6fa5829e522f297c99034db6ea"

RPROVIDES:${PN} += "binutils-/usr/include/bfd.h \
binutils-devel"

RDEPENDS:${PN} += "binutils \
zlib-devel"

inherit rpm
