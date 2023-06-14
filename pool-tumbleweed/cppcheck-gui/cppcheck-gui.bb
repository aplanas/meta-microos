SUMMARY = "A tool for static C/C++ code analysis"
DESCRIPTION = " \
This is the gui for Cppcheck, a program to detect bugs that your C/C++ compiler \
doesn't see."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.3"

RPM_NAME = "cppcheck-gui-2.10.3-3.1.aarch64.rpm"
RPM_HASH = "61b2388db4ca8bcd1930489473b64a689a28dea9b8e2f19eb3c478f59a1afc62341e7c15728f9e7137830b894cf8247d877497d24223f3455c595e2490bd628b"

RPROVIDES:${PN} += "cppcheck-gui"

RDEPENDS:${PN} += "cppcheck \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre.so.1 \
libstdc++.so.6"

inherit rpm
