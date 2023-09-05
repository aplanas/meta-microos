SUMMARY = "Generic map viewer: Shared Library"
DESCRIPTION = "The shared library for the MarbleWidget shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libmarblewidget-qt5-28-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f5a11dae2bfd0d0cc6abd8a642e9d68964ea80abfcffc18628fe765cb3befc7045330a3352dd0d280bb29244881b2e1abfdcc4f96c04478253fcd042fe6bafaa"

RPROVIDES:${PN} += "libmarblewidget-qt5-28 \
libmarblewidget-qt5.so.28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libastro.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
