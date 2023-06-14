SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5CoreAddons5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "ab41a9ba13fd9e2b1cecc9015c287dc18d0c72c78e606bc2d1c9ea2797a1ecd1e05b383a57336e289ee2ca0b738b439a879f39bcdff3cf974499c1cf829e0c06"

RPROVIDES:${PN} += "libKF5CoreAddons.so.5 \
libKF5CoreAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
