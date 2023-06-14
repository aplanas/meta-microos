SUMMARY = "A glib/gio-based lib used to develop file managers"
DESCRIPTION = "A glib/gio-based library providing some file management utilities and \
related-widgets missing in gtk+/glib. This is the core of PCManFM. The \
library is desktop independent (not LXDE specific) and has clean API. \
It can be used to develop other applications requiring file management \
functionality. For example, you can create your own file manager with \
facilities provided by libfm."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-1.3.2-1.12.aarch64.rpm"
RPM_HASH = "728d5b2def9f6e8b77bed67c143350cbbea078d358dabd761e816e41dccfec5ca4cbc7b69e2145c9fb81b134229878a8aa8e4e0bd018c5d8f95396ed9939dcaf"

RPROVIDES:${PN} += "config-libfm \
libfm"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfm-extra.so.4 \
libfm-gtk.so.4 \
libfm.so.4 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libmenu-cache.so.3"

inherit rpm
