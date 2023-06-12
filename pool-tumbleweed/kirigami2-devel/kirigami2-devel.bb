SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kirigami2-devel-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "cfd8a7ffdd41c1e6b01a69e3bda97f872970c47501851a4b243d50412ea131cded9237573c2aff268c0481a0f44a32821287efca316cc9501505dbe091214555"

RPROVIDES:${PN} += "cmake(KF5Kirigami2) \
kirigami2-devel \
kirigami2-devel(aarch-64)"
RDEPENDS:${PN} += "kirigami2 \
libKF5Kirigami2-5"

inherit rpm
