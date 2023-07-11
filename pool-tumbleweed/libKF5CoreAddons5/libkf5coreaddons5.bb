SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5CoreAddons5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "a03f89b3c66e44d0cec65758517cb17d6e9f50d4936511a8aa1fdd28f7bab2d79b43a4efe3d693c46096176e4c163a055675cbf376c81cb74966ddf20738e86f"

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
