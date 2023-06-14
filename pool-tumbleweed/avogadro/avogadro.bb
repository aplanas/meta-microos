SUMMARY = "A Molecular design tool"
DESCRIPTION = "Avogadro is an advanced molecular editor designed \
for cross-platform use in computational chemistry, \
molecular modeling, bioinformatics, materials science, \
and related areas. It offers flexible rendering and \
a powerful plugin architecture."
LICENSE = "GPL-2.0-only"

PV = "1.97.0"

RPM_NAME = "avogadro-1.97.0-1.3.aarch64.rpm"
RPM_HASH = "7fa040e667cb82fd551efb9b9f0679854a496da4386908ad69c71b948f3ec844e9c7e09d6875dada3b9c237b55eb25dff664d7b77cbd85a9b0c623f2d3d63238"

RPROVIDES:${PN} += "avogadro"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroQtGui.so.1 \
libAvogadroQtOpenGL.so.1 \
libAvogadroQtPlugins.so.1 \
libMoleQueueClient.so \
libMoleQueueServerCore.so \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
