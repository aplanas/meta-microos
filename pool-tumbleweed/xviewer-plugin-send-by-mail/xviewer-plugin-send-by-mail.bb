SUMMARY = "Xviewer send-by-mail plugin"
DESCRIPTION = "xviewer Send by Mail plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-send-by-mail-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "a20e478d464c860cbfad67e93d3ca5ef2a68b62df8f8288dffc23766ae4b12430b68d8f4dc9d553985a5da53b8793ae73f16f4a1b6924aae5dd260667e96f597"

RPROVIDES:${PN} += "libsend-by-mail.so()(64bit) \
metainfo() \
metainfo(xviewer-send-by-mail.metainfo.xml) \
xviewer-plugin-send-by-mail \
xviewer-plugin-send-by-mail(aarch-64) \
xviewer-plugins:/usr/lib64/xviewer/plugins/send-by-mail.plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
xviewer-plugins-data"

inherit rpm
