SUMMARY = "Avogadro libraries for computational chemistry"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis \
and data processing useful in computational chemistry, molecular \
modeling, bioinformatics, materials science, and related areas."
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "libAvogadro1-1.97.0-2.4.aarch64.rpm"
RPM_HASH = "c917b52baf661bea4cc9821fdcfca53db2100e2e86bb7153416e9e4b414c79166e43e71b8aa9cbbd9fb638b46e6986f29afbf36273306f29a7e3988a2de4e55a"

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
