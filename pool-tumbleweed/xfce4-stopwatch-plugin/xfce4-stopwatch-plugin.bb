SUMMARY = "A panel plugin to keep track of elapsed time"
DESCRIPTION = "A panel plugin to keep track of elapsed time"
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "xfce4-stopwatch-plugin-0.5.0-1.9.aarch64.rpm"
RPM_HASH = "436ca85f994ec7ed892ec967704f6b161c90492ef0c843753a2f619814a75e291ffcc81128da3519ad6cdf9ef9ede42830fbc236eb36e3e0fbdea1834f008291"

RPROVIDES:${PN} += "libstopwatch.so.0()(64bit) \
xfce4-panel-plugin-stopwatch \
xfce4-stopwatch-plugin \
xfce4-stopwatch-plugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4util.so.7()(64bit) \
xfce4-panel"

inherit rpm
