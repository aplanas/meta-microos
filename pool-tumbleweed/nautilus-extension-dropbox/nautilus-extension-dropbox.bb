SUMMARY = "Dropbox client integrated into Nautilus"
DESCRIPTION = "Dropbox is a free service that lets you bring your photos, docs, and videos anywhere \
and share them easily. Never email yourself a file again! \
 \
This package integrates dropbox seamless into nautilus."
LICENSE = "GPL-3.0-or-later & CC-BY-ND-3.0"

PV = "2020.03.04"

RPM_NAME = "nautilus-extension-dropbox-2020.03.04-5.3.aarch64.rpm"
RPM_HASH = "0bb1b3251bfbbb36b1259509f0733ac647f794c7abc990865ad74fb51529fc730aaeba06be088ea8130713a8cdb030394f0993181fc3fa32c49319ca249268d2"

RPROVIDES:${PN} += "libnautilus-dropbox.so \
nautilus-extension-dropbox"

RDEPENDS:${PN} += "dropbox \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4"

inherit rpm
