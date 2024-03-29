SUMMARY = "Serial-over-lan (sol) graphical client"
DESCRIPTION = "Graphical client for the amtterm utility"
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "amtterm-gtk-1.7-1.7.aarch64.rpm"
RPM_HASH = "284f6abcf4b5f71da3fd4cb53fb75447e9c1ac7a9006fce6f2b7d1d2a54693cf6d77abe77e35870988b5b1cbf39d0dd0e6ce4e555780f1fabfeec559cb6269f3"

RPROVIDES:${PN} += "amtterm-gtk"

RDEPENDS:${PN} += "amtterm \
libc.so.6 \
libcrypto.so.3 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libssl.so.3 \
libvte-2.91.so.0"

inherit rpm
