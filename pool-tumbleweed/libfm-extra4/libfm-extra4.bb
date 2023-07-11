SUMMARY = "A glib/gio-based lib used to develop file managers"
DESCRIPTION = "A glib/gio-based library providing some file management utilities and \
related-widgets missing in gtk+/glib. This is the core of PCManFM. The \
library is desktop independent (not LXDE specific) and has clean API. \
It can be used to develop other applications requiring file management \
functionality. For example, you can create your own file manager with \
facilities provided by libfm."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "libfm-extra4-1.3.1-1.21.aarch64.rpm"
RPM_HASH = "0e34e68b26ce8d0c14b3cc7039725f69f6a314ca616dae8d2d9fb4b5ba8e015601c24713f7f31aa57de34b5c228ededba25fde0065d7233159d59bb2946defbc"

RPROVIDES:${PN} += "libfm-extra.so.4 \
libfm-extra4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
