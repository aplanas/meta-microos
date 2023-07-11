SUMMARY = "Xviewer postasa plugin"
DESCRIPTION = "xviewer postasa plugin."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-postasa-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "0e00a840c2e5ef01c8fd25be1214145804e3a14d5e832744851917d2d455e32edad1d641eec618df75cc84abf4ba10a573344e6607f31bd62650c89fd8c8667c"

RPROVIDES:${PN} += "libpostasa.so \
xviewer-plugin-postasa \
xviewer-plugins-/usr/lib64/xviewer/plugins/postasa.plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdata.so.22 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
xviewer-plugins-data"

inherit rpm
