SUMMARY = "An IRC client"
DESCRIPTION = "IRC client written in GTK3+."
LICENSE = "GPL-3.0-or-later & ISC"

PV = "1.5.0"

RPM_NAME = "Srain-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "d1af2ecbad8c2919a65e395f3d7b8add9d1e1f00cce45be1b7d59b1349989d5d4d6bce79d18b62564303dda1ebd9b96e4d59421898032d293480df3765a522c0"

RPROVIDES:${PN} += "Srain \
config-Srain"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libconfig.so.11 \
libcrypto.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsecret-1.so.0 \
libsoup-2.4.so.1"

inherit rpm
