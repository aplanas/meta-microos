SUMMARY = "CPU Graph Plugin for the Xfce Panel"
DESCRIPTION = "The CPU Graph plugin diplays a customizable graph of the CPU load of either \
a specific CPU or all CPUs combined."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.7"

RPM_NAME = "xfce4-cpugraph-plugin-1.2.7-1.3.aarch64.rpm"
RPM_HASH = "bf6447c8a00a2d8f5e6392a74ab293be55e088e763829af68b21a7b00bcb7da7f24fc79c815673c70398ba301d62dc52f49029aac396323dbed7a67a7e33d9f2"

RPROVIDES:${PN} += "libcpugraph.so()(64bit) \
xfce4-cpugraph-plugin \
xfce4-cpugraph-plugin(aarch-64) \
xfce4-panel-plugin-cpugraph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
xfce4-panel"

inherit rpm
