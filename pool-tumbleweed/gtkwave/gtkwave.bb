SUMMARY = "Waveform viewer for Ditital Signals"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.114"

RPM_NAME = "gtkwave-3.3.114-1.4.aarch64.rpm"
RPM_HASH = "1b157b9dfaec460a4311603ea65f7c7c0467a504eed361bf97495c3ba898c01023d5be1fd4d7ad50cea9ce08745ade002a106560f5ba946bcf4413b67c6c4ddf"

RPROVIDES:${PN} += "gtkwave"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libJudy.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblzma.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libtcl8.6.so \
libtk8.6.so \
libz.so.1"

inherit rpm
