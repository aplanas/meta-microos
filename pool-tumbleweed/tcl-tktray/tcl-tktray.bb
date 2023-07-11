SUMMARY = "System Tray Icon Support for Tk on X11"
DESCRIPTION = "Tktray is a Tk extension that is able to create system tray icons. It \
follows http://www.freedesktop.org specifications when looking up the system \
tray manager.  This protocol is supported by modern versions of KDE and \
Gnome panels, and by some other panel-like application."
LICENSE = "TCL"

PV = "1.3.9"

RPM_NAME = "tcl-tktray-1.3.9-8.28.aarch64.rpm"
RPM_HASH = "4f02b1ceb7361e8fdd54312c4bcf0a117141e803c0056ceaa0bd328619aa1e13507f974fd73b7bd4b10f1e02530726fad3c7d71e0591fb9801937183b9525c3e"

RPROVIDES:${PN} += "libtktray1.3.9.so \
tcl-tktray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
tcl \
tk"

inherit rpm
