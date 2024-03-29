SUMMARY = "Pidgin integration for the Caja file manager"
DESCRIPTION = "This package provides Pidgin integration to the Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-sendto-pidgin-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "42ba45d02932d3576338eaae1ca19c2622d6ef998ed343e8cb9347d058ea812a9e98556439aa2cc2e9dec3197629d943b1c4e7fee8bef1560a1f515fecb0d984"

RPROVIDES:${PN} += "caja-extension-sendto-pidgin \
caja-sendto-pidgin \
libnstpidgin.so \
mate-file-manager-sendto-pidgin"

RDEPENDS:${PN} += "caja-extension-sendto \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
pidgin"

inherit rpm
