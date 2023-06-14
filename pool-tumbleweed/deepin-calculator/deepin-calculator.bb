SUMMARY = "The Deepin Calculator Application"
DESCRIPTION = "Deepin calculator is an easy to use calculator for ordinary users."
LICENSE = "GPL-3.0-or-later"

PV = "5.7.21"

RPM_NAME = "deepin-calculator-5.7.21-1.3.aarch64.rpm"
RPM_HASH = "31b26fc986eece45a60a35962451cfeaf77a837cba759cb896ce098bf37e0d39dd7b23ce294b4fac6164aca0a4510f5fba0e252aab0f9be2c88a1d948aabd361"

RPROVIDES:${PN} += "deepin-calculator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
