SUMMARY = "Development files for libkddockwidgets"
DESCRIPTION = "Development files for libkddockwidgets"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "kddockwidgets-qt6-devel-1.7.0-1.3.aarch64.rpm"
RPM_HASH = "c1bd4ac1f996b4a561059d0bfcf01825d7ff2af2719689da08b719b5b22155108447060a0d0aa931e864b0616aecdc39d23f8842283d628f462619d6ae3a1c8e"

RPROVIDES:${PN} += "cmake-KDDockWidgets-qt6 \
kddockwidgets-qt6-devel"

RDEPENDS:${PN} += "libkddockwidgets-qt6-1-7"

inherit rpm
