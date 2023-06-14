SUMMARY = "Graphical User Interface for the maxima Computer Algebra System"
DESCRIPTION = "wxMaxima is a GUI for the computer algebra system maxima \
based on wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "23.05.0"

RPM_NAME = "wxMaxima-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "a9d8d9dddc2933b806373dc24b36a945559996d4988228ac468d445551143dd4490c05452e6cac4d557ab6169af9cc99c868b16ae6945071d9725e636b8e96da"

RPROVIDES:${PN} += "wxMaxima"

RDEPENDS:${PN} += "/bin/sh \
gnuplot \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-aui-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-richtext-suse.so.9.0.0 \
libwx-gtk3u-webview-suse.so.9.0.0 \
maxima"

inherit rpm
