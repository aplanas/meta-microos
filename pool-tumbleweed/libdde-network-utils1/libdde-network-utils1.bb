SUMMARY = "Deepin Network Utils libraries"
DESCRIPTION = "The  package contains the Libraries for deepin-network-utils."
LICENSE = "GPL-3.0+"

PV = "5.4.13"

RPM_NAME = "libdde-network-utils1-5.4.13-1.7.aarch64.rpm"
RPM_HASH = "a4b0b20655115f4d48bd691fd84749bb0dd308ba21e2eb2bd4fb78881975f9584609d3eaabe0a7808584785cb36f09f3c6addd9beea784c62f3b41679b14e1b0"

RPROVIDES:${PN} += "libdde-network-utils.so.1()(64bit) \
libdde-network-utils1 \
libdde-network-utils1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdframeworkdbus.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgsettings-qt.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
