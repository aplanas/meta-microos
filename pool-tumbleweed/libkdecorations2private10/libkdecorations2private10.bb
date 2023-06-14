SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libkdecorations2private10-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "5c3abddf88298408bd1d727ade8e1b8809440414c620049d1233360c3e86d2dae1dff0f61498a4054e34aa08281605fdc39514a45c6206de6a22b4029db81946"

RPROVIDES:${PN} += "libkdecorations2private.so.10 \
libkdecorations2private10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
