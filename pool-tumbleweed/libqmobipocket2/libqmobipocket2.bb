SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libqmobipocket2-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "11bc40aaad0c468df829d3bdf7c5469fa1d4ccca24c5eadbc88dab51679189028964e4eb56d439b8b9d214361dc4c7d29c053d86757a5257d6023fe115f4a7d8"

RPROVIDES:${PN} += "libqmobipocket.so.2()(64bit) \
libqmobipocket2 \
libqmobipocket2(aarch-64) \
mobipocket"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
