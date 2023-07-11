SUMMARY = "CPU Graph Plugin for the Xfce Panel"
DESCRIPTION = "The CPU Graph plugin diplays a customizable graph of the CPU load of either \
a specific CPU or all CPUs combined."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.7"

RPM_NAME = "xfce4-cpugraph-plugin-1.2.7-1.4.aarch64.rpm"
RPM_HASH = "ff00ea8ab6ab51c863ba8074500131752c7dfc9d12a82b15bd6c98502cd57e8e58f3627b28f22f1a7f92f387cf17ae0b591567a407ffebd38b16b950bb48e72b"

RPROVIDES:${PN} += "libcpugraph.so \
xfce4-cpugraph-plugin \
xfce4-panel-plugin-cpugraph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
