SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5CoreAddons5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e3fb1a8c13dfb3ace36e29883d08344b6f6ea7ec62c2a3c9635b9ad383655ce3a5e1ddd7c3ae750347f1d532f9eaa36384b4524273f6d0a0fc544c5b988099b4"

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
