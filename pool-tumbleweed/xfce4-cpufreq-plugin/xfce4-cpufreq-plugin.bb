SUMMARY = "CPU Frequency Scaling Monitor Plugin for the Xfce Panel"
DESCRIPTION = "The CpuFreq scaling monitor plugin can be used to monitor the current CPU \
frequency and currently active governor."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "xfce4-cpufreq-plugin-1.2.8-1.3.aarch64.rpm"
RPM_HASH = "1b469fc1e24651bd67c06bd1eded5e7c277a9c4cdbe14d2813ed523a6c398a29c60ece7858a9154bc557e0674c7c73a75669263156b91f6a3da9dc450ce4c257"

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
