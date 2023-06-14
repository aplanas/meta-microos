SUMMARY = "Daemon for audio calls"
DESCRIPTION = "A daemon for audio calls."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.7"

RPM_NAME = "callaudiod-0.1.7-1.1.aarch64.rpm"
RPM_HASH = "0220e6b36e5e82a52844c193132f600579f4d58d08def98a777159c494a3ba4154163d547f2db16699738e1d2f8a287d3d05815c9b92a3edb092e95716e03941"

RPROVIDES:${PN} += "callaudiod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcallaudio-0.1.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
