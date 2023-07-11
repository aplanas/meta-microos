SUMMARY = "Disk Performance Plugin for the Xfce Panel"
DESCRIPTION = "The DiskPerf plugin displays the disk/partition performance as trasferred data \
per second."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "xfce4-diskperf-plugin-2.7.0-1.8.aarch64.rpm"
RPM_HASH = "47e15146ca72bd426f4e72070a01f847525c69eae9f66f76b7e331583ae1e50c7865cf5f87ef98e5bdde3b8c4c23a36f64bbefd6eb8e6e76a7f6b3886928a9ac"

RPROVIDES:${PN} += "libdiskperf.so \
xfce4-diskperf-plugin \
xfce4-panel-plugin-diskperf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
