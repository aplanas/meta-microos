SUMMARY = "Deepin Video Players"
DESCRIPTION = "libdmr is a library for accessing the Direct Rendering Manager on Linux, BSD and \
other operating systems that support the ioctl interface, and for chipsets with \
DRM memory manager, support for tracking relocations and buffers. libdmr is a \
low-level library, typically used by graphics drivers such as the Mesa DRI and X \
drivers."
LICENSE = "GPL-3.0-or-later & OpenSSL"

PV = "5.10.8"

RPM_NAME = "libdmr0_1-5.10.8-1.5.aarch64.rpm"
RPM_HASH = "9bfbba74dc9cb802b29bffc31bb71184749a627bc405464937af4ea72605273eb13af474057caa42a6b5a31abdb5febab24a7de616be21bf02ed025242dd8cc2"

RPROVIDES:${PN} += "libdmr.so.0.1 \
libdmr0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsettings-qt.so.1 \
libstdc++.so.6"

inherit rpm
