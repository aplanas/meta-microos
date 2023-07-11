SUMMARY = "Widgets hooks for configuration entities"
DESCRIPTION = "KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5ConfigGui5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "c6119f2274aaac7e05741006dd11f2ee850f5008e8c0b3aee76c712279677496cc24412b059be2be8453f168caca7a9f82ec3cdb7b9e1479b60ce311b62fc59a"

RPROVIDES:${PN} += "libKF5ConfigGui.so.5 \
libKF5ConfigGui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
