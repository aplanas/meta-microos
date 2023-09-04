SUMMARY = "KConfig Development files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves. It features: \
 \
- centralized definition: define your configuration in an XML file and use \
`kconfig_compiler` to generate classes to read and write configuration entries. \
 \
- lock-down (kiosk) support. \
 \
KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kconfig-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "b6fd01c22e35be3b8b697aceb45567a8a814ec31005eb9e263c5862a797b4572402b0dcabaa5ac34232386ffa237e5025a23c7b640ef2bd2806adaa807f662d6"

RPROVIDES:${PN} += "cmake-KF5Config \
kconfig-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5Xml \
extra-cmake-modules \
kconf-update5 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore5 \
libKF5ConfigGui5 \
libKF5ConfigQml5 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
