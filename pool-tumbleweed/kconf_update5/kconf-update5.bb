SUMMARY = "Configuration file access"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
This package contains the kconf_update tool."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kconf_update5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "f2d1f0d1acab786fd0d57244647261c4e3eea77743b49102d49700e47baf5381a2ad51ba4c0ca1f5ec6b8c9c2264dd5f4749223a2e150ed064c76c256b012624"

RPROVIDES:${PN} += "kconf-update5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigCore5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
