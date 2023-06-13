SUMMARY = "Configuration application for VNC session"
DESCRIPTION = "This is configuration application to configure sharing and security from inside VNC session."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "vncmanager-controller-1.0.1-6.7.aarch64.rpm"
RPM_HASH = "4deec30999f40699d5e7c7e86f2fd4a5ff543f5737a2fa4ed8c527b9cdf5dd614b23fa68d481e6fa9e9b95713135d6480761136f883049b17169b58d84281154"

RPROVIDES:${PN} += "vncmanager-controller \
vncmanager-controller(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXvnc.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
vncmanager"

inherit rpm
