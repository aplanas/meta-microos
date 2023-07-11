SUMMARY = "Development files for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
This package provides development files for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-devel-1.3-1.21.aarch64.rpm"
RPM_HASH = "2c400c5e65bb7469b5fdc1752587357056c00aae8c7831180d6bec0ad95fad1ffde3ae6b785c3f94a46789f6cb8c0815721b8d66149a846ea7f8e21ebd2cd58c"

RPROVIDES:${PN} += "libcangjie-devel \
pkgconfig-cangjie"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcangjie-tools \
libcangjie2 \
pkgconfig-sqlite3"

inherit rpm
