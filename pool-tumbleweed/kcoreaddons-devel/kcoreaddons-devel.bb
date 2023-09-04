SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kcoreaddons-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "e1316801dd80ec31067c93b7d9fae5a392d1565f6b48fb1243ba20f7f63820abe0c423ae4390bd372a72bd44dd1a0045f6e0ebd159e6f26963476ea75f31db7c"

RPROVIDES:${PN} += "cmake-KF5CoreAddons \
kcoreaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
kcoreaddons \
ld-linux-aarch64.so.1 \
libKF5CoreAddons5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
