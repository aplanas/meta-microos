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

RPROVIDES:${PN} += "application() \
application(avogadro2.desktop) \
avogadro \
avogadro(aarch-64) \
metainfo() \
metainfo(avogadro2.appdata.xml) \
mimehandler(chemical/x-cml) \
mimehandler(chemical/x-xyz)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libAvogadroCore.so.1()(64bit) \
libAvogadroIO.so.1()(64bit) \
libAvogadroQtGui.so.1()(64bit) \
libAvogadroQtOpenGL.so.1()(64bit) \
libAvogadroQtPlugins.so.1()(64bit) \
libMoleQueueClient.so()(64bit) \
libMoleQueueServerCore.so()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
