SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "perf-gtk-6.3.9-80.8.aarch64.rpm"
RPM_HASH = "9b4dd2077058be2507fa272413ccae7665ecb02c387a21b58aea03f7695af300eadced169b7dde13f4c445b891665f44863c6433902ad78e9f1c898b6a562542"

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
