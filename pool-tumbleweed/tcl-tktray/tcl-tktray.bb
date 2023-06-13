SUMMARY = "System Tray Icon Support for Tk on X11"
DESCRIPTION = "Tktray is a Tk extension that is able to create system tray icons. It \
follows http://www.freedesktop.org specifications when looking up the system \
tray manager.  This protocol is supported by modern versions of KDE and \
Gnome panels, and by some other panel-like application."
LICENSE = "TCL"

PV = "1.3.9"

RPM_NAME = "tcl-tktray-1.3.9-8.27.aarch64.rpm"
RPM_HASH = "2ac423bda8a8857bb805a718ca97396d84b035706e605c0fb74420a658467c5aa3dda2423a208480956f784643a142cdbb0dd1caa7abb9e5e4954affe5a0c8f6"

RPROVIDES:${PN} += "libtktray1.3.9.so()(64bit) \
tcl-tktray \
tcl-tktray(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
tcl \
tk"

inherit rpm
