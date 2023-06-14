SUMMARY = "Configuration file access"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
This package contains the kconf_update tool."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kconf_update5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "518461435681f439be9c61f5fcee86022b0f43d122b2fce280de18199933451ad5d8e00c37eee10b01d1f77baf6d0bce2b19fa25043fc040a35f4c0374cbdab1"

RPROVIDES:${PN} += "kconf-update5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigCore5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
