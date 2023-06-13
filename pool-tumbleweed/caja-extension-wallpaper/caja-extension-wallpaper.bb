SUMMARY = "Allows to quickly set desktop background"
DESCRIPTION = "Caja-share allows you to quickly set desktop background wallpaper."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-wallpaper-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "62cffd41edd381a1d4a2bf96050abaf186ae90a7872ce424c9a373a16845899d7a4fc300965007d9612297625e58cdd4463f4d27f4942064fd00f4e618ddd5ae"

RPROVIDES:${PN} += "caja-extension-wallpaper \
caja-extension-wallpaper(aarch-64) \
caja-wallpaper \
libcaja-wallpaper.so()(64bit)"

RDEPENDS:${PN} += "caja \
libc.so.6(GLIBC_2.17)(64bit) \
libcaja-extension.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
