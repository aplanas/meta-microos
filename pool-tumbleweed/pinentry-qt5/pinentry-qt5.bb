SUMMARY = "Simple PIN or Passphrase Entry Dialog for QT5"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using the QT5 UI toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "pinentry-qt5-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "6db5e33da6e9e0f5a6d1ec2e456fefa0d31a20e2f323bed39c2948dbeaa920b7cdea572ab12553adc195126798c092e603a7e600ee9478d09e4fc3fc200446b3"

RPROVIDES:${PN} += "pinentry-dialog \
pinentry-gui \
pinentry-qt \
pinentry-qt4 \
pinentry-qt5 \
pinentry-qt5(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libassuan.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libsecret-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
pinentry"

inherit rpm
