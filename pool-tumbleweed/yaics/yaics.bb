SUMMARY = "A simple GNU social client written in C++/Qt"
DESCRIPTION = "Yaics is a simple GNU social client written in C++ and Qt and \
licensed under the GNU GPL 3.0 (or later)."
LICENSE = "GPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "yaics-0.6-2.9.aarch64.rpm"
RPM_HASH = "ff81ac402d8b1b83599262a0ea36fb50b9ee2757a135876d4ec235ce2a8cf7818fb12c18611e4893eb7b34e457afb0b6acfec39d30e010b35de169f7c8a5e516"

RPROVIDES:${PN} += "application() \
application(yaics.desktop) \
metainfo() \
metainfo(yaics.appdata.xml) \
yaics \
yaics(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
