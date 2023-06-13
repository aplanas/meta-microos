SUMMARY = "Waveform viewer for Ditital Signals"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.114"

RPM_NAME = "gtkwave-3.3.114-1.3.aarch64.rpm"
RPM_HASH = "cbfa79ce4391a50e799dc2e513b6997d8ded9bc21e590eac60bb649ccc3706a49c0d47ebd5689a6858d42f162f633fe6b76d2fc1126927c8e7cc1047c83750df"

RPROVIDES:${PN} += "application() \
application(gtkwave.desktop) \
gtkwave \
gtkwave(aarch-64) \
mimehandler(application/vnd.gtkwave-ae2) \
mimehandler(application/vnd.gtkwave-aet) \
mimehandler(application/vnd.gtkwave-evcd) \
mimehandler(application/vnd.gtkwave-fst) \
mimehandler(application/vnd.gtkwave-ghw) \
mimehandler(application/vnd.gtkwave-gtkw) \
mimehandler(application/vnd.gtkwave-lx2) \
mimehandler(application/vnd.gtkwave-lxt) \
mimehandler(application/vnd.gtkwave-lxt2) \
mimehandler(application/vnd.gtkwave-vcd) \
mimehandler(application/vnd.gtkwave-vzt)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libJudy.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libtcl8.6.so()(64bit) \
libtk8.6.so()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
