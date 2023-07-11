SUMMARY = "CPU Frequency Scaling Monitor Plugin for the Xfce Panel"
DESCRIPTION = "The CpuFreq scaling monitor plugin can be used to monitor the current CPU \
frequency and currently active governor."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "xfce4-cpufreq-plugin-1.2.8-1.4.aarch64.rpm"
RPM_HASH = "8f4510ce5a0bffc6d88eaa18879a94f92dd26ef3bca5e62b338ef08e6c0d95741342b13ee631ca9d937f2a885f2f45363f72b3bc68ad187ad5af8df5efd35247"

RPROVIDES:${PN} += "libcpufreq.so \
xfce4-cpufreq-plugin \
xfce4-panel-plugin-cpufreq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
