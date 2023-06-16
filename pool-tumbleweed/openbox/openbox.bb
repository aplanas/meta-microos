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

RPROVIDES:${PN} += "config-openbox \
openbox \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libobrender.so.32 \
libobt.so.2 \
libstartup-notification-1.so.0 \
xdg-menu \
xsltproc"

inherit rpm
