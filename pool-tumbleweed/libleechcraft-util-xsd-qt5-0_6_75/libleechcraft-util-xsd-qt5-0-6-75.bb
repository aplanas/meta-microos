SUMMARY = "XSD utility library for LeechCraft"
DESCRIPTION = "A library providing some classes to be used with the \
XmlSettingsDialog LeechCraft subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-xsd-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "f8ca72d956d57eb5dc4d5640b74734aa1af306f244e3686db7183989385ea9e29a2eafda47d9bbe14c1c5d594830877733302dee91c9733c510947968aa9cb76"

RPROVIDES:${PN} += "libleechcraft-util-xsd-qt5-0-6-75 \
libleechcraft-util-xsd-qt5.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
