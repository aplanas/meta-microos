SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libkdecorations2private10-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "0e3a44ee212c27320c8735fe1a87efd0aa25507cd257037b1a202ec4df68ae36eb33f0a18d40292ef8afad13008fe66788369f696f35faf3508493b46a10548f"

RPROVIDES:${PN} += "libkdecorations2private.so.10 \
libkdecorations2private10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
