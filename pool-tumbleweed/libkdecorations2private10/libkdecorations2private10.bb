SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libkdecorations2private10-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "7c8488722c26e5c7e39c99dcc997eecb1e4ceaa3272ac204b29b8c19213a15e824de7ad8fd6325ff42380b37738de8ae7a8177d974f5f6cbdc940912807be89b"

RPROVIDES:${PN} += "libkdecorations2private.so.10 \
libkdecorations2private10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
