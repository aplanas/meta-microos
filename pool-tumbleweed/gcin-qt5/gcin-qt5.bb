SUMMARY = "Gcin qt5 immodule"
DESCRIPTION = "gcin qt5 immodule, support Qt5-based applications"
LICENSE = "GPL-2.0-only"

PV = "2.9.0"

RPM_NAME = "gcin-qt5-2.9.0-4.16.aarch64.rpm"
RPM_HASH = "e1bedcc2510cb478559b78441648df519b520a2095fe2be7ca6cceb7baece561a38b9b1333fe4dc89764e5244c31708e084477d847762897027f41e85dc60032"

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
