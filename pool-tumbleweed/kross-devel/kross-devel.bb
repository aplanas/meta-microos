SUMMARY = "Development files for the Kross scripting bridge"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kross-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "d777073eb48b5aef86ae29473ea967efe7e405cdaf2f39a81ed5e2e49225622b79553aca80c099b416bb0ec5d59984f77a69aa4032ecdd0474ad2b18342ca901"

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
