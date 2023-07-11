SUMMARY = "Free Pascal interface to Qt5"
DESCRIPTION = "Library that allows to use Qt5 with Free Pascal"
LICENSE = "LGPL-3.0-only"

PV = "2.2.6"

RPM_NAME = "libQt5Pas1-2.2.6-1.4.aarch64.rpm"
RPM_HASH = "d25f2e1699c31ee8a415ce8c87beb329a4baaf1114fe4ef7ce069b386044783d10b01065cce45bfae1ce5453fea175bf7f619af476979e13268096905d41080d"

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
