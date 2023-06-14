SUMMARY = "Avogadro libraries for computational chemistry"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis \
and data processing useful in computational chemistry, molecular \
modeling, bioinformatics, materials science, and related areas."
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "libAvogadro1-1.97.0-2.3.aarch64.rpm"
RPM_HASH = "3b641d7a3f79b9c662abcfce82a40ba5ac22cce9b2158ecad310e9d36b221a223f92e37150fa8009bbd9fd337e8e05b1d66323539c57a01cd9ce79d20fc23cf7"

RPROVIDES:${PN} += "libAvogadro1 \
libAvogadroCalc.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroMoleQueue.so.1 \
libAvogadroQtGui.so.1 \
libAvogadroQtOpenGL.so.1 \
libAvogadroQtPlugins.so.1 \
libAvogadroQuantumIO.so.1 \
libAvogadroRendering.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLEW.so.2.2 \
libGLX.so.0 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libm.so.6 \
libstdc++.so.6 \
libsymspg.so.1"

inherit rpm
