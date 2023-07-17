SUMMARY = "Build environment for the KCrash application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcrash-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "a2073abd327d1f66f79592d59ac9020dc84ac3aebb429c7257e28ef2b312085da1fdf554f085290a8c18ca28483ce0f3e210cbbb7f980d77e6a4d38d6b17f075"

RPROVIDES:${PN} += "cmake-KF5Crash \
kcrash-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Crash5"

inherit rpm
