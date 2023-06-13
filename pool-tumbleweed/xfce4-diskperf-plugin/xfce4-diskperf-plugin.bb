SUMMARY = "Disk Performance Plugin for the Xfce Panel"
DESCRIPTION = "The DiskPerf plugin displays the disk/partition performance as trasferred data \
per second."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "xfce4-diskperf-plugin-2.7.0-1.7.aarch64.rpm"
RPM_HASH = "c4bd162e75b48a604153d982b5ab63c0b3a6bdeeab8487cba2250346ca4bd37fa49a125606ea58bd7c8f3f5cd638491aed62a32d36aa3e4ddde1b3b8761235d4"

RPROVIDES:${PN} += "libdiskperf.so()(64bit) \
xfce4-diskperf-plugin \
xfce4-diskperf-plugin(aarch-64) \
xfce4-panel-plugin-diskperf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
xfce4-panel"

inherit rpm
