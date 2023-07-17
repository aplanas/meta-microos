SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcoreaddons-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "b5d3cf87525c9fd6e5e393e31c7386e20d87f284f9a36ec1b08d519c31a7c3a5917613f7a4f4bd82d3f3a497d46da706603bbef10c6f79df5bd2fadf4f610551"

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
