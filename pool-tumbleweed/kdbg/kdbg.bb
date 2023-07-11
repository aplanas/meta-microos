SUMMARY = "Graphical User Interface for GDB"
DESCRIPTION = "KDbg is a graphical user interface for GDB, the GNU debugger. It \
provides an intuitive interface for setting breakpoints, inspecting \
variables, and stepping through code."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "kdbg-3.0.1-1.18.aarch64.rpm"
RPM_HASH = "cd426c7493b8cc5092004bdf7115b61343b14f7743a1d1ed82b79f17c6b266c4af584472bb67019288f104ae63f71db253068b7f2ab8d830d55ebdafe74f131e"

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
