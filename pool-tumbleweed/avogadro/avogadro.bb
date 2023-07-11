SUMMARY = "A Molecular design tool"
DESCRIPTION = "Avogadro is an advanced molecular editor designed \
for cross-platform use in computational chemistry, \
molecular modeling, bioinformatics, materials science, \
and related areas. It offers flexible rendering and \
a powerful plugin architecture."
LICENSE = "GPL-2.0-only"

PV = "1.97.0"

RPM_NAME = "avogadro-1.97.0-1.4.aarch64.rpm"
RPM_HASH = "c13a30d4e025ca383c5cb9a1b0fe96654e5517a1e931f8e2575bf19d30d135083cbd1757642c489f27236011b80d26ca36f82d1f1b4c3423642234ab545c6913"

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
