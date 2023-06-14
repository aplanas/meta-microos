SUMMARY = "Free Pascal interface to Qt5"
DESCRIPTION = "Library that allows to use Qt5 with Free Pascal"
LICENSE = "LGPL-3.0-only"

PV = "2.2.6"

RPM_NAME = "libQt5Pas1-2.2.6-1.3.aarch64.rpm"
RPM_HASH = "dd5ddb5d50a50c3d94867eb2e8fb65098069cefb1b0defe51ee5b5904b4b69cf950b59c9d883818a68aac6387155978bc3481e44b5865b9823a669e0868e0364"

RPROVIDES:${PN} += "libQt5Pas.so.1 \
libQt5Pas1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
