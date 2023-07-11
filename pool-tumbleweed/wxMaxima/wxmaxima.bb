SUMMARY = "Graphical User Interface for the maxima Computer Algebra System"
DESCRIPTION = "wxMaxima is a GUI for the computer algebra system maxima \
based on wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "23.05.1"

RPM_NAME = "wxMaxima-23.05.1-1.1.aarch64.rpm"
RPM_HASH = "2806f91d74f5727a5237d0a0dab555cc81d3650faa3ef0729ba4628e9ffba134491d37657c31da3333bc7d8c11009cca60dbe46cf0b2747d1e851dd1bc093928"

RPROVIDES:${PN} += "wxMaxima"

RDEPENDS:${PN} += "/usr/bin/sh \
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
