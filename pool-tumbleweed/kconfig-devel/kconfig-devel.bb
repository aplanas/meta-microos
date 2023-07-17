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

PV = "5.108.0"

RPM_NAME = "kconfig-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "4d9da9297a542a905c72f5c7a36747cb1db81f19e2db7c6cb64dd59e89db5788a4f089e70bd28be88fbb9af8d50849237af265f9902fe1240947a98b385600f0"

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
