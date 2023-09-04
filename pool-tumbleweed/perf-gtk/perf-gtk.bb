SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "perf-gtk-6.4.11-81.1.aarch64.rpm"
RPM_HASH = "e124ef9d4fe97b3059c3c17b356d1aa164e265f37c559d541d115815d979f188f4ac08f335b50813b054d84832b45198b856dae6b92bca7f4080b187c464e808"

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
