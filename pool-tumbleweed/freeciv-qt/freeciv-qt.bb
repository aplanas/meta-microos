SUMMARY = "Qt client for freeciv"
DESCRIPTION = "Freeciv executable using Qt library"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "freeciv-qt-3.0.7-1.2.aarch64.rpm"
RPM_HASH = "81332ca4697c0e97a8bf7ebc12c760127359943c5e6d01a03ab1535e9cc0e181fd3abeaa2cbcafc0881ac237c39526bd48b8e1fe4835af88786debaf3be21df6"

RPROVIDES:${PN} += "freeciv-client-3.0.7 \
freeciv-qt"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libicuuc.so.73 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
