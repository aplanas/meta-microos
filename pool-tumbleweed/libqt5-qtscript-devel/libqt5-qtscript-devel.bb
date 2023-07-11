SUMMARY = "Development files for the Qt 5 Script library"
DESCRIPTION = "Qt Script is a module for adding scripting to applications. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5Script5."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtscript-devel-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "b37f9c9933cf859becebf32d7f1306ffbb2e9bd98c636453200dcdac222566a7b199802360b430eb477f124c381156c59fd11bdd7eaa2c42d5c6e7743d8d5f0f"

RPROVIDES:${PN} += "cmake-Qt5Script \
cmake-Qt5ScriptTools \
libQt5Script-devel \
libqt5-qtscript-devel \
pkgconfig-Qt5Script \
pkgconfig-Qt5ScriptTools"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Script5 \
pkgconfig-Qt5Core"

inherit rpm
