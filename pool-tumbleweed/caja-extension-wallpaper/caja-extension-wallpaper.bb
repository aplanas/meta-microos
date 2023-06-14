SUMMARY = "Allows to quickly set desktop background"
DESCRIPTION = "Caja-share allows you to quickly set desktop background wallpaper."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-wallpaper-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "62cffd41edd381a1d4a2bf96050abaf186ae90a7872ce424c9a373a16845899d7a4fc300965007d9612297625e58cdd4463f4d27f4942064fd00f4e618ddd5ae"

RPROVIDES:${PN} += "caja-extension-wallpaper \
caja-wallpaper \
libcaja-wallpaper.so"

RDEPENDS:${PN} += "caja \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
