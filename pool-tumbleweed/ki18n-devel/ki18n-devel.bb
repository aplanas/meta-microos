SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "ki18n-devel-5.107.0-1.3.aarch64.rpm"
RPM_HASH = "37c2391cc40f9caa4bd27d5465b4b678b196346622f12142d28fee1fd3d327026d7e030a96856f4082a7b8cefa46a88ffbeaa8275b3ab3cad37d6b12f6fa9c9e"

RPROVIDES:${PN} += "cmake-KF5I18n \
ki18n-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
gettext-runtime \
gettext-tools \
libKF5I18n5 \
python3"

inherit rpm
