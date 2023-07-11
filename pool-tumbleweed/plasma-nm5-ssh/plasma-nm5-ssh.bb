SUMMARY = "SSH support for plasma-nm5"
DESCRIPTION = "Secure Shell (SSH) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-ssh-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "afb6d2300bbc597ba243ad79adfffb51757a3df069b72cbf259d1506360232a9d5c1c9f8d0dca66d9d4492161d3b0a583b8d4e12aad027ec27ebcc9b8c02b103"

RPROVIDES:${PN} += "NetworkManager-ssh-frontend \
plasma-nm5-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma-nm5"

inherit rpm
