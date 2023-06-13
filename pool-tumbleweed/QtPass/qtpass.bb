SUMMARY = "A multi-platform gui for pass"
DESCRIPTION = "QtPass is a multi-platform GUI for pass, the standard unix password manager."
LICENSE = "GPL-3.0-only"

PV = "1.3.2"

RPM_NAME = "QtPass-1.3.2-1.19.aarch64.rpm"
RPM_HASH = "d05cc62eefffb3bbfd956cc32fa707b088bd2efce4c3768dffb1df75bc2304524523eb18a6ef4fe04ee2c5d4964b233292c1480b238b6f52a3a4279bcaab4895"

RPROVIDES:${PN} += "QtPass \
QtPass(aarch-64) \
application() \
application(qtpass.desktop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
password-store"

inherit rpm
