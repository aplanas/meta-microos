SUMMARY = "Daemon for audio calls"
DESCRIPTION = "A daemon for audio calls."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.7"

RPM_NAME = "callaudiod-0.1.7-1.1.aarch64.rpm"
RPM_HASH = "0220e6b36e5e82a52844c193132f600579f4d58d08def98a777159c494a3ba4154163d547f2db16699738e1d2f8a287d3d05815c9b92a3edb092e95716e03941"

RPROVIDES:${PN} += "callaudiod \
callaudiod(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcallaudio-0.1.so.0()(64bit) \
libcallaudio-0.1.so.0(LIBCALLAUDIO_0_0_0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
