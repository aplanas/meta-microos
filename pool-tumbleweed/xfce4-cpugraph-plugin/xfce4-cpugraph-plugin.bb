SUMMARY = "CPU Graph Plugin for the Xfce Panel"
DESCRIPTION = "The CPU Graph plugin diplays a customizable graph of the CPU load of either \
a specific CPU or all CPUs combined."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "xfce4-cpugraph-plugin-1.2.8-1.1.aarch64.rpm"
RPM_HASH = "87b7e8c75ac3eadd93163b909f9236320998d3d32ae87e03cbcd5bcb49d8fd2628f3c07fe1998a3bd6fd425326af48bd166090ae7b93525fa66e76737f5a4e7f"

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
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
