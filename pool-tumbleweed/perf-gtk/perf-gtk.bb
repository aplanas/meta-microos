SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "perf-gtk-6.4.3-80.10.aarch64.rpm"
RPM_HASH = "a4c5eb0f91a8bacd5d2cbfd596daacbb65e25d89086b1628cfda02a2199035bc2828b9fd988200c4196e59a2dc1298bf97fa0c1787cf0d4672690b9c58202385"

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
