SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcoreaddons-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "70839b820ac3ce610a8faa77f3529cb4f7d8c6c77ac178a268dfd28f74833e51b7115bf101555aa79622cfec25baa06a48efa57b1683a39340f7fbad2b6b8fc1"

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
