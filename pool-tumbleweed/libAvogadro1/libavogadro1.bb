SUMMARY = "Avogadro libraries for computational chemistry"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis \
and data processing useful in computational chemistry, molecular \
modeling, bioinformatics, materials science, and related areas."
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "libAvogadro1-1.97.0-2.3.aarch64.rpm"
RPM_HASH = "3b641d7a3f79b9c662abcfce82a40ba5ac22cce9b2158ecad310e9d36b221a223f92e37150fa8009bbd9fd337e8e05b1d66323539c57a01cd9ce79d20fc23cf7"

RPROVIDES:${PN} += "libAvogadro1 \
libAvogadro1(aarch-64) \
libAvogadroCalc.so.1()(64bit) \
libAvogadroCore.so.1()(64bit) \
libAvogadroIO.so.1()(64bit) \
libAvogadroMoleQueue.so.1()(64bit) \
libAvogadroQtGui.so.1()(64bit) \
libAvogadroQtOpenGL.so.1()(64bit) \
libAvogadroQtPlugins.so.1()(64bit) \
libAvogadroQuantumIO.so.1()(64bit) \
libAvogadroRendering.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhdf5.so.200()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libsymspg.so.1()(64bit)"

inherit rpm
