SUMMARY = "Build environment for the KCrash application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kcrash-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "a709a9e66dde9e5f3631a5aa1304e41f8a0442649702355ec0a1e91ce2682f2868b6078ec4385f450aa593fe55866a62d2c1f28fca23d10f9cfd7c5b0e365d14"

RPROVIDES:${PN} += "cmake-KF5Crash \
kcrash-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Crash5"

inherit rpm
