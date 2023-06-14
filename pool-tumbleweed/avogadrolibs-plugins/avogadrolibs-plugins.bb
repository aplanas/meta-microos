SUMMARY = "Plugins for Avogadro2libs"
DESCRIPTION = "This package contains the vendor provided plugins for Avogadro2"
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "avogadrolibs-plugins-1.97.0-2.3.aarch64.rpm"
RPM_HASH = "50f80122cf968529d03e83752c5033dca8e4d4574117add27479fc7b36cdb6f41b405176f49044c5906356801216ba45d53f9b232b771233f9614b1f71278425"

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
