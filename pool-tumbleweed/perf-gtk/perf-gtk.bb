SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "perf-gtk-6.4.2-80.9.aarch64.rpm"
RPM_HASH = "8c0e35cb84c1d1006588a407b95c505b49eadbbd65cf037f953dcb35700053974fc3657acd9d2c26a003ce5d0e6b37fcfdf045ee5b58b0465fc78a08b50f0f6e"

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
