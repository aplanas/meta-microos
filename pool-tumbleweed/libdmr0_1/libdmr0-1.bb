SUMMARY = "Deepin Video Players"
DESCRIPTION = "libdmr is a library for accessing the Direct Rendering Manager on Linux, BSD and \
other operating systems that support the ioctl interface, and for chipsets with \
DRM memory manager, support for tracking relocations and buffers. libdmr is a \
low-level library, typically used by graphics drivers such as the Mesa DRI and X \
drivers."
LICENSE = "GPL-3.0-or-later & OpenSSL"

PV = "5.10.8"

RPM_NAME = "libdmr0_1-5.10.8-1.6.aarch64.rpm"
RPM_HASH = "2a993ed74f7cf9868e94d5f00decdbe6dc800061671590115bd6e9452925f9e73d1319a88504f4d184c2aa36d49a30ef2450091ca0deb5558d769274338b3391"

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
