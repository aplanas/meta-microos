SUMMARY = "Build environment for the KCrash application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcrash-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "35ae2aa23f454627d84de782c39cdcbb0c3ebdf61e42bc9b81fe8623702e6720b1b4a6874bb6e2c7b8c35948ff2ef3b079f6dd98c9a1ad5819daf7269774d0f6"

RPROVIDES:${PN} += "cmake-KF5Crash \
kcrash-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Crash5"

inherit rpm
