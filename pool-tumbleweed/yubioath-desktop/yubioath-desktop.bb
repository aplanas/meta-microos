SUMMARY = "Graphical interface for displaying OATH codes with a Yubikey"
DESCRIPTION = "The Yubico Authenticator is a graphical desktop tool for generating \
Open AuTHentication (OATH) event-based HOTP and time-based TOTP \
one-time password codes, with the help of a Yubikey NEO that protects \
the shared secrets."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "yubioath-desktop-5.1.0-3.1.aarch64.rpm"
RPM_HASH = "9676427c99c69578d423d3b0ad6af3c412f8331521dc072e10acb901dfb7cf236cb608b0667712ca5b311cbe1c42428470785456523f180b70ee6023365a9df4"

RPROVIDES:${PN} += "application() \
application(yubioath-desktop.desktop) \
yubioath-desktop \
yubioath-desktop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
pyotherside \
yubikey-manager"

inherit rpm
