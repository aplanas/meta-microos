SUMMARY = "libkdepim library"
DESCRIPTION = "The libkdepim library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Libkdepim5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f80436630e70124ae3e222b36563a28110544a68721af81c90a0c0500193c92d8b1c3e164911a1eaf29be0b6c0543da77b1559d88a1235d9af56ec60a5a6fcd6"

RPROVIDES:${PN} += "libKPim5Libkdepim.so.5 \
libKPim5Libkdepim5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkdepim \
libstdc++.so.6"

inherit rpm
