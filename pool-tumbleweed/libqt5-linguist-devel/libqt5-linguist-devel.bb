SUMMARY = "Development files for the Qt 5 Linguist tools"
DESCRIPTION = "The Qt 5 Linguist Tools - development files."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-linguist-devel-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "625e50c8a7cde2538dd2eadb47ab4447560c2d0fe603327fec536bf170497bc8dce9639ec9f33163af5c9c48ae416834ca492b96513a31830ca23087fb2bb883"

RPROVIDES:${PN} += "cmake-Qt5LinguistTools \
libqt5-linguist-devel"

RDEPENDS:${PN} += "libqt5-linguist \
pkgconfig-Qt5Core"

inherit rpm
