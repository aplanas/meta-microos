SUMMARY = "Plugins for Avogadro2libs"
DESCRIPTION = "This package contains the vendor provided plugins for Avogadro2"
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "avogadrolibs-plugins-1.97.0-2.4.aarch64.rpm"
RPM_HASH = "d54606d2fa1b4651476fa0f0558875012aec0a6957979b89e4b149a64af7411b16b667b5a1309e5a21b48aeda118bc693057b49febbf82c544f5ba6df9f190c0"

RPROVIDES:${PN} += "avogadrolibs-plugins"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libAvogadroCalc.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroMoleQueue.so.1 \
libAvogadroQtGui.so.1 \
libAvogadroQtOpenGL.so.1 \
libAvogadroQuantumIO.so.1 \
libAvogadroRendering.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmsym.so.0.2 \
libstdc++.so.6"

inherit rpm
