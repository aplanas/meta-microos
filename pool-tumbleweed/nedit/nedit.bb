SUMMARY = "A GUI text editor"
DESCRIPTION = "NEdit is a GUI style plain text editor for workstations with the X Window System \
and Motif. NEdit provides all of the standard menu, dialog, editing, \
mouse support, macro extension language, syntax highlighting, \
and a lot other nice features (and extensions for programmers)."
LICENSE = "GPL-2.0+"

PV = "5.7"

RPM_NAME = "nedit-5.7-2.26.aarch64.rpm"
RPM_HASH = "1ea84cd59ef858dec22000d741f56733778f5ffdc7901dfb0344f7dd4fa2ade9eb4290c3cd71a743d49b0134e7fe127dbc22e5ce345d222f70cc04b9c38ab763"

RPROVIDES:${PN} += "nedit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
update-desktop-files"

inherit rpm
