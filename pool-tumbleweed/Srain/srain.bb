SUMMARY = "An IRC client"
DESCRIPTION = "IRC client written in GTK3+."
LICENSE = "GPL-3.0-or-later & ISC"

PV = "1.5.0"

RPM_NAME = "Srain-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "dcda76bfd6aa928eddb14b1057186649f30c12bf9b16bb756a7912877ccd134ae54c14c6d1b2683c7f4f1bb6f09c404dcc90ee6ef39f0e30b469830ea913429b"

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
