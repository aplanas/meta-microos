SUMMARY = "Function Plotting Utility and more"
DESCRIPTION = "GNUplot is a command line driven interactive function plotting utility. \
GNUplot supports many different types of terminals, plotters, and \
printers (including many color devices and pseudodevices like LaTeX) \
and can easily be extended to include new devices."
LICENSE = "GPL-2.0-or-later & SUSE-Gnuplot"

PV = "5.4.7"

RPM_NAME = "gnuplot-5.4.7-1.1.aarch64.rpm"
RPM_HASH = "a8f75aff5eb8a7b8e7fdb64092def9e4ed97daedd4b8ebdd0b724e152a5795f664267b05883a9b1a4d2671449f9b40704d56ec80b8973c1754c90bb3cdb13a61"

RPROVIDES:${PN} += "gnuplot \
gnuplot(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcaca.so.0()(64bit) \
libcairo.so.2()(64bit) \
libcerf.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgd.so.3()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit)"

inherit rpm
