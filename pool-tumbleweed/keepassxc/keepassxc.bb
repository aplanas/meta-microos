SUMMARY = "Qt5-based Password Manager"
DESCRIPTION = "A password manager or safe which manages your passwords. Databases \
are locked with a master key/password or a key disk. The databases \
are encrypted using AES and Twofish."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.5"

RPM_NAME = "keepassxc-2.7.5-1.2.aarch64.rpm"
RPM_HASH = "5a635469fcf433439db77e8cb69c1e6cb5a550d6afca5fc63aa20b942cb6169493908421adf83e05259f753ef35edc9114c012e39e80bee718844ed93d670a09"

RPROVIDES:${PN} += "keepassx \
keepassxc \
libkeepassxc-autotype-xcb.so"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXtst.so.6 \
libargon2.so.1 \
libbotan-2.so.19 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libminizip.so.1 \
libpcsclite.so.1 \
libqrencode.so.4 \
libreadline.so.8 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
shared-mime-info \
update-desktop-files"

inherit rpm
