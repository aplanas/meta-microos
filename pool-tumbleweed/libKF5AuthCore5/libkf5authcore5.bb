SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5AuthCore5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "b037585105f7e37831007626e1fa9fb6426f3543f0c77fc0c5fb257886ccec60aea768b47ae5d7cd8f613f9b1d436f2f3784938057fb16e42eac3271c90e4df5"

RPROVIDES:${PN} += "libKF5AuthCore.so.5 \
libKF5AuthCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
