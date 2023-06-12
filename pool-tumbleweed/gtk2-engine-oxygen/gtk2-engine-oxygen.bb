SUMMARY = "Oxygen GTK 2.x Theme Engine"
DESCRIPTION = "Oxygen-Gtk2 is a port of the KDE Oxygen widget theme to Gtk 2.x. \
 \
It's primary goal is to ensure visual consistency between Gtk-based \
and Qt-based applications. A secondary objective \
is to also have a stand-alone nice looking gtk theme that would \
behave well on other Desktop Environments. \
 \
This package contains the Oxygen Gtk 2.x theme engine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.6"

RPM_NAME = "gtk2-engine-oxygen-1.4.6-5.19.aarch64.rpm"
RPM_HASH = "c9533aeaa64bfa3690dded551f74e442c7f40fd2ce6545f6d6ad4107cdff76674db0068b537f9fe682bfd036056afa5fd18415f62e38e77658ed46896ed10a9d"

RPROVIDES:${PN} += "gtk2-engine-oxygen \
gtk2-engine-oxygen(aarch-64) \
liboxygen-gtk.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
