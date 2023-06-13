SUMMARY = "QTerm is BBS client"
DESCRIPTION = "QTerm is a full featured BBS client written in Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.4"

RPM_NAME = "qterm-0.7.4-1.12.aarch64.rpm"
RPM_HASH = "87f421213ca9d238f3e49f1f88540b7692cd313733c932f1ee48b13ac84a4c5cfa85782282dbd4c249be15c554d972a409a055cb42d98a9e7fe8809853795c96"

RPROVIDES:${PN} += "application() \
application(qterm.desktop) \
qterm \
qterm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Script.so.5()(64bit) \
libQt5Script.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
