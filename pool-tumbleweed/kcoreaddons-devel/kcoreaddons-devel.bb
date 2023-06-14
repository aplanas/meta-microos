SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcoreaddons-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c8961d5820f1eb9210d69037d6d966b28261ecce5d0b5ae2caa3423d1919300016780dfac7481fe81a67483d2141fb43a4a096d889e9c6622732dc7b960dcccf"

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
