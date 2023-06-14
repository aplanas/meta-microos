SUMMARY = "A user-friendly system monitor"
DESCRIPTION = "deepin-system-monitor is a simple process and system monitor for the Deepin \
Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.27"

RPM_NAME = "deepin-system-monitor-5.8.27-1.5.aarch64.rpm"
RPM_HASH = "5a36e3160ba82b723001c2d2dcb234919e08f725ee96b6df9d7d30c3e5a89855735c63c1159192327b36dfa64155086def651b62415de7e9ea4ff6731489e7a1"

RPROVIDES:${PN} += "deepin-system-monitor"

RDEPENDS:${PN} += "/usr/bin/pkexec \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libpcap.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libxcb-icccm.so.4 \
libxcb.so.1 \
qt5integration"

inherit rpm
