SUMMARY = "Qt client for freeciv"
DESCRIPTION = "Freeciv executable using Qt library"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "freeciv-qt-3.0.7-1.2.aarch64.rpm"
RPM_HASH = "81332ca4697c0e97a8bf7ebc12c760127359943c5e6d01a03ab1535e9cc0e181fd3abeaa2cbcafc0881ac237c39526bd48b8e1fe4835af88786debaf3be21df6"

RPROVIDES:${PN} += "application() \
application(org.freeciv.qt.desktop) \
freeciv-qt \
freeciv-qt(aarch-64) \
freeciv_client-3.0.7 \
metainfo() \
metainfo(org.freeciv.qt.appdata.xml)"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
