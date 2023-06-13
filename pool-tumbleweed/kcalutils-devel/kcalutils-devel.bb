SUMMARY = "Development files for kcalutils"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications wanting to use kcalutils."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kcalutils-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a029ea532e3c1ecfb4bf4d496cb104ddb87c517c44c5d38ca3a53383fd43e84b4a3163a14d70740205de00d49b1a9a18e7c43419254bd8492b43dde5d05277da"

RPROVIDES:${PN} += "cmake(KF5CalendarUtils) \
cmake(KPim5CalendarUtils) \
kcalutils-devel \
kcalutils-devel(aarch-64) \
kcalutils5-devel"

RDEPENDS:${PN} += "cmake(KF5CalendarCore) \
cmake(KF5CoreAddons) \
cmake(KF5KDELibs4Support) \
libKPim5CalendarUtils5"

inherit rpm
