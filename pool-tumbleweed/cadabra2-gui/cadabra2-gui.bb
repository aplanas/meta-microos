SUMMARY = "GUI for cadabra2: computer algebra system for problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides the GUI for cadabra2 and it's desktop menu integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "cadabra2-gui-2.4.3.2-1.6.aarch64.rpm"
RPM_HASH = "e7079988d31217b32639c61b8a3c3f4bf26121392e6896dca2a8116ae2200d18a8d69b8a244387a936988720b4d2cef6bccfa611cebaa4bb6404432b81081058"

RPROVIDES:${PN} += "cadabra \
cadabra2-gui"

RDEPENDS:${PN} += "cadabra2 \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtkmm-3.0.so.1 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
