SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "ki18n-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "33e3fc15d00d9ee002d3b952cbb6fabd05a17cb358c22c04756ea0cd7668be606e0f8c6ef886170cc653931ea324d9de78a2d329fd1cab2186f7b7d304007e37"

RPROVIDES:${PN} += "cmake-KF5I18n \
ki18n-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
gettext-runtime \
gettext-tools \
libKF5I18n5 \
python3"

inherit rpm
