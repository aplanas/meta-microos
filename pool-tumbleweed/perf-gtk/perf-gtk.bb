SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "perf-gtk-6.4.6-80.12.aarch64.rpm"
RPM_HASH = "2c46ae2126f9956b34747ef0595554ae22a01093023d7bd8b8537a68ceeb6e63a292819f1a8deecfb0048e4deb13cbbc6cd3a98725eaf3f87f9fb82ad31f650a"

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
