SUMMARY = "A simple morse tutor using the Koch method"
DESCRIPTION = "A simple morse tutor using the Koch method."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "kochmorse-3.5.1-1.3.aarch64.rpm"
RPM_HASH = "d92b42be8570d25341fc5ec1ddc4ba373c6e6b0f63d8dc9bb5c47ac97c841a6753c9af63aacbc8dfd0772d93200b46186aa1f83848bc824d7a7f9fd46f372b74"

RPROVIDES:${PN} += "application() \
application(kochmorse.desktop) \
kochmorse \
kochmorse(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
