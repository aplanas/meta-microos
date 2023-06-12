SUMMARY = "Development files for libadwaita-qt6"
DESCRIPTION = "The libadwaita-qt6-devel package contains libraries and header files for \
developing applications that use libadwaita-qt6-1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaita-qt6-devel-1.4.2-3.3.aarch64.rpm"
RPM_HASH = "8cb7d167aa76deae9734d4412a3c8c7b5766e30582365a2efed70489620e12df46a4531412eeb0f08b38d8b71685a52f3016dcec66953a934fadf85470665e2f"

RPROVIDES:${PN} += "cmake(AdwaitaQt6) \
libadwaita-qt6-devel \
libadwaita-qt6-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core) \
cmake(Qt6Widgets) \
libadwaitaqt6-1"

inherit rpm
