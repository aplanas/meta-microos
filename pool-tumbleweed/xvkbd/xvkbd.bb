SUMMARY = "Virtual Keyboard for the X Window System"
DESCRIPTION = "Xvkbd is a virtual (graphical) keyboard program for the X Window System \
which provides a facility to enter characters onto other clients \
(software) by clicking on an on-screen keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "4.1"

RPM_NAME = "xvkbd-4.1-1.12.aarch64.rpm"
RPM_HASH = "6703c2b4ae0a330d0eaefbffc5c04e6765727d1317edd14d53d1da8b91a77150b27d6561699c0b4a7b4c78e189b0a08438379d5713c4d74521eb3eae00c84c38"

RPROVIDES:${PN} += "xvkbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXmu.so.6 \
libXt.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
