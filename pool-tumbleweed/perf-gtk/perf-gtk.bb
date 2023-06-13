SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "perf-gtk-6.3.4-80.3.aarch64.rpm"
RPM_HASH = "d5f3644bf0857c4654107d4e252c232d7e5e6bcfbaf0ad4569334a5b4a6ac2d980b6e11473b75319bfe9e4de407d931833356d7801f9b2e215c46bd6919b8875"

RPROVIDES:${PN} += "libperf-gtk.so()(64bit) \
perf-gtk \
perf-gtk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
perf"

inherit rpm
