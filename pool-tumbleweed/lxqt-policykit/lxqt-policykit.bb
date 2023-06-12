SUMMARY = "PolicyKit authentication agent"
DESCRIPTION = "PolicyKit authentication agent for LXQt"
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "lxqt-policykit-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "050552add74ef4f2b0a9b45f07660dc0795d01070413a30540d446de5b94707cf5669c670a472c97808ea859e27997654340eae98e8a08ac4a1ec0658e7d83b0"

RPROVIDES:${PN} += "config(lxqt-policykit) \
lxqt-policykit \
lxqt-policykit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblxqt.so.1()(64bit) \
libpolkit-qt5-agent-1.so.1()(64bit) \
libpolkit-qt5-core-1.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm