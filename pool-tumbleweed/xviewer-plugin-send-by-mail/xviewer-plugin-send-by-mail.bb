SUMMARY = "Xviewer send-by-mail plugin"
DESCRIPTION = "xviewer Send by Mail plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-send-by-mail-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "a20e478d464c860cbfad67e93d3ca5ef2a68b62df8f8288dffc23766ae4b12430b68d8f4dc9d553985a5da53b8793ae73f16f4a1b6924aae5dd260667e96f597"

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
