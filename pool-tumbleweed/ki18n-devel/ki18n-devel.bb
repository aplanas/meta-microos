SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "ki18n-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "edfc0c79d4ff2a224bbb5004f32dfe79aafc907b3512b003ca968f79dd45abe2e5efcff658fea09e36ce11cca80a6c00adc1c298d4cd2140ff9ec82a2b1cf3e3"

RPROVIDES:${PN} += "cmake-KF5I18n \
ki18n-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
gettext-runtime \
gettext-tools \
libKF5I18n5 \
python3"

inherit rpm
