SUMMARY = "A glib/gio-based lib used to develop file managers"
DESCRIPTION = "A glib/gio-based library providing some file management utilities and \
related-widgets missing in gtk+/glib. This is the core of PCManFM. The \
library is desktop independent (not LXDE specific) and has clean API. \
It can be used to develop other applications requiring file management \
functionality. For example, you can create your own file manager with \
facilities provided by libfm."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "libfm-extra4-1.3.1-1.20.aarch64.rpm"
RPM_HASH = "db8b1c4c37aaa712afdd94e7f3d73f9d9e335d490b3a92793ca844c5a6e3f8c4db5f4c631df61fa7bc974a85df907f0322bcd67cf99360d6e023283f764cc333"

RPROVIDES:${PN} += "libfm-extra.so.4()(64bit) \
libfm-extra4 \
libfm-extra4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
