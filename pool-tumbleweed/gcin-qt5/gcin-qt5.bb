SUMMARY = "Gcin qt5 immodule"
DESCRIPTION = "gcin qt5 immodule, support Qt5-based applications"
LICENSE = "GPL-2.0-only"

PV = "2.9.0"

RPM_NAME = "gcin-qt5-2.9.0-4.18.aarch64.rpm"
RPM_HASH = "82d6e4a2c2397a9fc80f1041512cb49419fd32bf3d579b01cbaab914e68468ba21a85dd53d940308a1f1ba4ff2b13e1dc4a8190ec47b67eec0279f97eda6303b"

RPROVIDES:${PN} += "gcin-qt5 \
gcin-qt5-immodule \
libgcinplatforminputcontextplugin.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcin \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgcin-im-client.so.1"

inherit rpm
