SUMMARY = "Utility to display X11 font names"
DESCRIPTION = "xfontsel application provides a simple way to display the X11 core \
protocol fonts known to your X server, examine samples of each, and \
retrieve the X Logical Font Description ('XLFD') full name for a font."
LICENSE = "X11"

PV = "1.1.0"

RPM_NAME = "xfontsel-1.1.0-2.3.aarch64.rpm"
RPM_HASH = "2f2c01db818c67df9706ec5aa754f7927ab0f71f84f60ccc26072e6ce3bdeb8b996b874510f98ccbceae76e6932582e2e5754cd588f710fd292411f21041aba8"

RPROVIDES:${PN} += "xfontsel \
xfontsel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
