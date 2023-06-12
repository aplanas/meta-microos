SUMMARY = "Pump.io social network desktop client"
DESCRIPTION = "Dianara is a client for pump.io (and GNU MediaGoblin), a desktop \
application for GNU/Linux that allows users to manage their pump.io \
social networking accounts without the need to use a web browser. \
You can read your timelines, post messages and pictures, and manage \
your contacts."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "dianara-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "32923b0c8e1aa0d5cde8e3de486d8eb9fc707c6ea89af48ee797177aa1b5ff98eb8e663334cecdc282e82f083f7240ce1cc9ced55867e1be3721ef9125d72477"

RPROVIDES:${PN} += "application() \
application(org.nongnu.dianara.desktop) \
dianara \
dianara(aarch-64) \
metainfo() \
metainfo(org.nongnu.dianara.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
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
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqca-qt5.so.2()(64bit) \
libqoauth.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
