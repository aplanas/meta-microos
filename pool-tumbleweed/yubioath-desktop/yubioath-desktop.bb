SUMMARY = "Graphical interface for displaying OATH codes with a Yubikey"
DESCRIPTION = "The Yubico Authenticator is a graphical desktop tool for generating \
Open AuTHentication (OATH) event-based HOTP and time-based TOTP \
one-time password codes, with the help of a Yubikey NEO that protects \
the shared secrets."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "yubioath-desktop-5.1.0-3.2.aarch64.rpm"
RPM_HASH = "bf36cc0acfaf94b509638f91ecbac2d931098bc80db9b29b48103dbaf543abefb45e2f99b69719fd1459a4fa37f80a1a50c245e704231c35cf453b25d3fcfc2d"

RPROVIDES:${PN} += "yubioath-desktop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
pyotherside \
yubikey-manager"

inherit rpm
