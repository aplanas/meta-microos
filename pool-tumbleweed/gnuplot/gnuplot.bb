SUMMARY = "Function Plotting Utility and more"
DESCRIPTION = "GNUplot is a command line driven interactive function plotting utility. \
GNUplot supports many different types of terminals, plotters, and \
printers (including many color devices and pseudodevices like LaTeX) \
and can easily be extended to include new devices."
LICENSE = "GPL-2.0-or-later & SUSE-Gnuplot"

PV = "5.4.7"

RPM_NAME = "gnuplot-5.4.7-1.1.aarch64.rpm"
RPM_HASH = "a8f75aff5eb8a7b8e7fdb64092def9e4ed97daedd4b8ebdd0b724e152a5795f664267b05883a9b1a4d2671449f9b40704d56ec80b8973c1754c90bb3cdb13a61"

RPROVIDES:${PN} += "gnuplot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libcaca.so.0 \
libcairo.so.2 \
libcerf.so.2 \
libgcc-s.so.1 \
libgd.so.3 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
