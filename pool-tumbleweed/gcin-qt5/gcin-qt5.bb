SUMMARY = "Gcin qt5 immodule"
DESCRIPTION = "gcin qt5 immodule, support Qt5-based applications"
LICENSE = "GPL-2.0-only"

PV = "2.9.0"

RPM_NAME = "gcin-qt5-2.9.0-4.16.aarch64.rpm"
RPM_HASH = "e1bedcc2510cb478559b78441648df519b520a2095fe2be7ca6cceb7baece561a38b9b1333fe4dc89764e5244c31708e084477d847762897027f41e85dc60032"

RPROVIDES:${PN} += "gcin-qt5 \
gcin-qt5(aarch-64) \
gcin-qt5-immodule \
libgcinplatforminputcontextplugin.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcin \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcin-im-client.so.1()(64bit)"

inherit rpm
