SUMMARY = "Configuration file access"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
This package contains the kconf_update tool."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kconf_update5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7052493bf97840b5414f696c38eb155075c1e5c5b72de7e8c7659f2da75574f011d4b16d7dd2231ebbc456dc9e464d2850c30ca1d843771bd42ec75f09cab037"

RPROVIDES:${PN} += "kconf-update5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigCore5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
