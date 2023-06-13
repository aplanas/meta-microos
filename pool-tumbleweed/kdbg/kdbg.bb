SUMMARY = "Graphical User Interface for GDB"
DESCRIPTION = "KDbg is a graphical user interface for GDB, the GNU debugger. It \
provides an intuitive interface for setting breakpoints, inspecting \
variables, and stepping through code."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "kdbg-3.0.1-1.17.aarch64.rpm"
RPM_HASH = "e76025dceeb047f5755852822aa17de46cde81592ce4eb9a4cc44306babdf113e703a1530bb8f2a232b2d1d4941329cbdc2352e0fe92c367f0613c64d5c4c49c"

RPROVIDES:${PN} += "application() \
application(kdbg.desktop) \
config(kdbg) \
kdbg \
kdbg(aarch-64)"

RDEPENDS:${PN} += "gdb \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
