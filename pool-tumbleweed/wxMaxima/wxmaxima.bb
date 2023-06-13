SUMMARY = "Graphical User Interface for the maxima Computer Algebra System"
DESCRIPTION = "wxMaxima is a GUI for the computer algebra system maxima \
based on wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "23.05.0"

RPM_NAME = "wxMaxima-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "a9d8d9dddc2933b806373dc24b36a945559996d4988228ac468d445551143dd4490c05452e6cac4d557ab6169af9cc99c868b16ae6945071d9725e636b8e96da"

RPROVIDES:${PN} += "application() \
application(io.github.wxmaxima_developers.wxMaxima.desktop) \
metainfo() \
metainfo(io.github.wxmaxima_developers.wxMaxima.appdata.xml) \
mimehandler(text/x-maxima-out) \
mimehandler(text/x-maximasession) \
mimehandler(text/x-wxmathml) \
mimehandler(text/x-wxmaxima-batch) \
wxMaxima \
wxMaxima(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnuplot \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_richtext-suse.so.9.0.0()(64bit) \
libwx_gtk3u_webview-suse.so.9.0.0()(64bit) \
maxima"

inherit rpm
