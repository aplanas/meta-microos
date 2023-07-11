SUMMARY = "Development files for libadwaita-qt6"
DESCRIPTION = "The libadwaita-qt6-devel package contains libraries and header files for \
developing applications that use libadwaita-qt6-1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaita-qt6-devel-1.4.2-3.4.aarch64.rpm"
RPM_HASH = "2295e71a4fad467eaafaaf84e81d79d71435ccc0678085c07dd0a1d0b6a9cc6da874172532a83df413ad61306b630d2fbff8afce1519cf587a6744cc57bde334"

RPROVIDES:${PN} += "cmake-AdwaitaQt6 \
libadwaita-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Widgets \
libadwaitaqt6-1"

inherit rpm
