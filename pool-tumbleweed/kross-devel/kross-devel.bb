SUMMARY = "Development files for the Kross scripting bridge"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kross-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "4b3d145d704c60ac67bd9cd34898454035021fa2849098340083cee719329b07b666a148c0181aff55d3c8cd839292862880c9afa10bd9bba2228e52dc6b3ff6"

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
