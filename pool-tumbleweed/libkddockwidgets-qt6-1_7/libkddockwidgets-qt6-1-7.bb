SUMMARY = "Qt dock widget library, suitable for replacing QDockWidget"
DESCRIPTION = "KDDockWidgets is a Qt dock widget library written by KDAB, suitable for \
replacing QDockWidget and implementing advanced functionalities missing in Qt. \
 \
Although KDDockWidgets is ready to be used out of the box, it can also be seen \
as a framework to allow building very tailored custom docking systems. It tries \
to expose every internal widget and every knob for the app developer to tune."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "libkddockwidgets-qt6-1_7-1.7.0-1.3.aarch64.rpm"
RPM_HASH = "4735b908b1f30ddde373d00f9939cdec558639086789ab1246140036f7b28dba072271d52d317b1285dcd257c1d10986394ba12b3daa64457b794d6bb5598eea"

RPROVIDES:${PN} += "libkddockwidgets-qt6-1-7 \
libkddockwidgets-qt6.so.1.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
