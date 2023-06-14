SUMMARY = "Graphical User Interface for GDB"
DESCRIPTION = "KDbg is a graphical user interface for GDB, the GNU debugger. It \
provides an intuitive interface for setting breakpoints, inspecting \
variables, and stepping through code."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "kdbg-3.0.1-1.17.aarch64.rpm"
RPM_HASH = "e76025dceeb047f5755852822aa17de46cde81592ce4eb9a4cc44306babdf113e703a1530bb8f2a232b2d1d4941329cbdc2352e0fe92c367f0613c64d5c4c49c"

RPROVIDES:${PN} += "config-kdbg \
kdbg"

RDEPENDS:${PN} += "gdb \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
