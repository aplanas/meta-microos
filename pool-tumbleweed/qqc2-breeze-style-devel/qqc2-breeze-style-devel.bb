SUMMARY = "Development Files for the Breeze Qt Quick Controls 2 Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-breeze-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "qqc2-breeze-style-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "70d6187503f8baf1a0843fded5c0d18f0fcc119481a670d0f4c4f473b1aa9769e2b43cc894ac1bd19f0fd9bcd29f72b2ea109297107e829abc46efed5529694a"

RPROVIDES:${PN} += "cmake-KF5QQC2BreezeStyle \
qqc2-breeze-style-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
qqc2-breeze-style"

inherit rpm
