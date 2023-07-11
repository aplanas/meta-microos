SUMMARY = "Plugin for the Qt Interface designer"
DESCRIPTION = "The qwt-designer package contains the plugin for the Qt User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-designer-5.2.3_qt5+git20181129.2819734-3.19.aarch64.rpm"
RPM_HASH = "ebadc97a82aa0c66a96ea07635aca306c376c4863dddb029a923a8f07cb058bd993d4fb7c1e4b325ba0b20cda1d682e4d3a2c9b30d6cf2098971e490e33586a0"

RPROVIDES:${PN} += "libqwt5-designer-plugin.so \
qwt-designer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqwt5-qt5.so.5 \
libstdc++.so.6 \
qwt-devel"

inherit rpm
