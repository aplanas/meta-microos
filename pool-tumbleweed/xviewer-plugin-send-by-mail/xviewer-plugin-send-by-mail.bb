SUMMARY = "Xviewer send-by-mail plugin"
DESCRIPTION = "xviewer Send by Mail plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-send-by-mail-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "3bbc7ad7dc5ac10076b45108478b98e742352b7bc7d0861436fa975443950e9a1debc0219eb7386da56bf538113476abf322a32753cf9d389938886a219c0cc7"

RPROVIDES:${PN} += "libsend-by-mail.so \
xviewer-plugin-send-by-mail \
xviewer-plugins-/usr/lib64/xviewer/plugins/send-by-mail.plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
xviewer-plugins-data"

inherit rpm
