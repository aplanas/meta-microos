SUMMARY = "A tool for static C/C++ code analysis"
DESCRIPTION = " \
This is the gui for Cppcheck, a program to detect bugs that your C/C++ compiler \
doesn't see."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.3"

RPM_NAME = "cppcheck-gui-2.10.3-3.1.aarch64.rpm"
RPM_HASH = "61b2388db4ca8bcd1930489473b64a689a28dea9b8e2f19eb3c478f59a1afc62341e7c15728f9e7137830b894cf8247d877497d24223f3455c595e2490bd628b"

RPROVIDES:${PN} += "cppcheck-gui \
cppcheck-gui(aarch-64)"

RDEPENDS:${PN} += "cppcheck \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Help.so.5()(64bit) \
libQt5Help.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcre.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
