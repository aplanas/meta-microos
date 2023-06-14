SUMMARY = "Virtual Keyboard for the X Window System"
DESCRIPTION = "Xvkbd is a virtual (graphical) keyboard program for the X Window System \
which provides a facility to enter characters onto other clients \
(software) by clicking on an on-screen keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "4.1"

RPM_NAME = "xvkbd-4.1-1.11.aarch64.rpm"
RPM_HASH = "fcdbab5d22d575ec15d343abd71a565ff8d83c1a54432f134ab86fb9c934736ed1a4e367ace017e99dbaf292ca3a58248761a36082dfa97541aa9e87c5f7a9d8"

RPROVIDES:${PN} += "xvkbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXmu.so.6 \
libXt.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
