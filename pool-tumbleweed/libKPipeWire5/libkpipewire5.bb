SUMMARY = "PipeWire integration for KDE Plasma - main library"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the main KPipeWire library."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "libKPipeWire5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "eeeed432b902bdc472855919c95daa1dba496c15ca5ae0b1fbfff3780380ca5d7b4b0d6275b1e3727dea55ae910ba7012ec9b2967e05bcd4e1e83aab52a7cd5c"

RPROVIDES:${PN} += "libKPipeWire.so.5 \
libKPipeWire5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libpipewire-0.3.so.0 \
libstdc++.so.6"

inherit rpm
