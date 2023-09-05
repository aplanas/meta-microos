SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "perf-gtk-6.4.12-81.2.aarch64.rpm"
RPM_HASH = "6c9750cd3bf0da11c1fe42923f862aa2278e951ab58612c8660dff50e058d27415b6acc26307593e782965fad223435a0ab44080d71aee3f2eebd66094866a98"

RPROVIDES:${PN} += "libperf-gtk.so \
perf-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
perf"

inherit rpm
