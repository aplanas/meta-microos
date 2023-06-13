SUMMARY = "ICCCM and EWMH Compliant Window Manager with Very Few Dependencies"
DESCRIPTION = "Openbox is a window manager for the X Window System. It currently runs \
on a large list of platforms. It was originally based on Blackbox, but \
is, since version 3.0, a complete reimplementation with these features, \
among others: \
 \
o ICCCM and EWMH compliance o Chainable key bindings o Customizable \
mouse actions o Window resistance o Multihead Xinerama support o Pipe \
menus \
 \
The configuration tool 'obconf' is recommended along with this package."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-3.6.1-4.1.aarch64.rpm"
RPM_HASH = "cbd1e0745df78423472698ea3bbd85fe91e18288c351e97d6d767b29d37b0237ae539f131ce923605faee125e76f4f9192fd1efab4dfc0c107268061d6771f25"

RPROVIDES:${PN} += "application() \
application(openbox.desktop) \
config(openbox) \
openbox \
openbox(aarch-64) \
windowmanager"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libobrender.so.32()(64bit) \
libobt.so.2()(64bit) \
libstartup-notification-1.so.0()(64bit) \
xdg-menu \
xsltproc"

inherit rpm
