SUMMARY = "Grantlee theme support"
DESCRIPTION = "the grantleetheme library adds Grantlee theme support for PIM applications."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "grantleetheme-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "bad52855cb4633f0b3ced7744e629bbd8a81358fe95b0e10f3863c7f5a3b1fe9a9739a01ab6c356e3ecf57e203e3700fddffa8a1be1ad13aa7b26e8ffb0b21d8"

RPROVIDES:${PN} += "grantleetheme"

RDEPENDS:${PN} += "grantlee5 \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5GuiAddons.so.5 \
libKF5IconThemes.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
