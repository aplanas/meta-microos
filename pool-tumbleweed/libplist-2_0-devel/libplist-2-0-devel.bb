SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Development Files"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the development files for C."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libplist-2_0-devel-2.2.0-4.7.aarch64.rpm"
RPM_HASH = "babd056776d90333360997fa6e1c79b7652ee028e51f052ab97e613780077fc0160846bb7263363ef70ecf62767322a7da3bc2b9d7417667d9d36bba8bd1ebae"

RPROVIDES:${PN} += "libplist-2-0-devel \
libplist-devel \
pkgconfig-libplist-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplist-2-0-3"

inherit rpm
