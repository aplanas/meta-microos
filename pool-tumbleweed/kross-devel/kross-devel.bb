SUMMARY = "Development files for the Kross scripting bridge"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kross-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "63b1b4aa1298f31545c7acd44194b4f71d8e2007b9b6352db279c7bc5fb0fb1462f722bb51ccab528ffccd811bfe34829adaa53cbbe616162d9725c75c94c415"

RPROVIDES:${PN} += "cmake-KF5Kross \
kross-devel"

RDEPENDS:${PN} += "cmake-KF5I18n \
cmake-KF5IconThemes \
cmake-KF5KIO \
cmake-KF5Parts \
cmake-KF5WidgetsAddons \
cmake-Qt5Core \
cmake-Qt5Script \
cmake-Qt5Widgets \
cmake-Qt5Xml \
extra-cmake-modules \
kross"

inherit rpm
