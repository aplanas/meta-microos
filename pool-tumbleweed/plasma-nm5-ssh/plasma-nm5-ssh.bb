SUMMARY = "SSH support for plasma-nm5"
DESCRIPTION = "Secure Shell (SSH) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-ssh-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "828e392005f47c57653e90928400f2313d8e83b2e9233b81768c142b14b408ffb9a44a83a2d3adf14092df69e57e56413a8aa2cbc8013db536808af91cd292fb"

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
