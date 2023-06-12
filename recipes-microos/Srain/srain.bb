SUMMARY = "An IRC client"
DESCRIPTION = "IRC client written in GTK3+."
LICENSE = "GPL-3.0-or-later & ISC"

PV = "1.5.0"

RPM_NAME = "Srain-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "d1af2ecbad8c2919a65e395f3d7b8add9d1e1f00cce45be1b7d59b1349989d5d4d6bce79d18b62564303dda1ebd9b96e4d59421898032d293480df3765a522c0"

RPROVIDES:${PN} += "Srain \
Srain(aarch-64) \
application() \
application(im.srain.Srain.desktop) \
config(Srain) \
metainfo() \
metainfo(im.srain.Srain.metainfo.xml) \
mimehandler(x-scheme-handler/irc) \
mimehandler(x-scheme-handler/ircs)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libconfig.so.11()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-2.4.so.1()(64bit)"

inherit rpm
