SUMMARY = "Share directory from caja via Samba"
DESCRIPTION = "Caja-share allows you to quickly share a directory from the Caja \
file manager without requiring root access. It uses Samba, so your \
directories can be accessed by any operating system."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-share-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "2f1dbea21a8d113b2156bae763bb43dde64767d5848e30cb2693dcc2035db85a3fe5524ddf56a3f6eb3b4eb685e43fe7c8c868699dd1c69329f7685c91eff996"

RPROVIDES:${PN} += "caja-extension-share \
caja-share \
libcaja-share.so \
mate-file-manager-share"

RDEPENDS:${PN} += "caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
mate-icon-theme \
samba"

inherit rpm
