SUMMARY = "Qt5-based Password Manager"
DESCRIPTION = "A password manager or safe which manages your passwords. Databases \
are locked with a master key/password or a key disk. The databases \
are encrypted using AES and Twofish."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.5"

RPM_NAME = "keepassxc-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "e0bf3bfd2f7b84af16135fcc1a0d6b104ac1b3011ff2b5392418bf0a3a2ca18a5a597d384afc625338653231c5697c8c672fac92b42e080b62dd65e4ad422e34"

RPROVIDES:${PN} += "application() \
application(org.keepassxc.KeePassXC.desktop) \
keepassx \
keepassxc \
keepassxc(aarch-64) \
libkeepassxc-autotype-xcb.so()(64bit) \
metainfo() \
metainfo(org.keepassxc.KeePassXC.appdata.xml) \
mimehandler(application/x-keepass2)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libargon2.so.1()(64bit) \
libbotan-2.so.19()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libminizip.so.1()(64bit) \
libpcsclite.so.1()(64bit) \
libqrencode.so.4()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
libz.so.1()(64bit) \
shared-mime-info \
update-desktop-files"

inherit rpm
