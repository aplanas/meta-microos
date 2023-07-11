SUMMARY = "A music player for local files and remote streams"
DESCRIPTION = "A music player for listening local music files, online radios and Audio CDs."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "melody-2.2.1-1.19.aarch64.rpm"
RPM_HASH = "93b50f88315e71bc28abdaf95a2560499b9de251e1e092e29a7b22ce5e98f52c8bfc021de1f64fe19072d2a2b459dd0eb309ba134d6c1b12696fedf4dc750902"

RPROVIDES:${PN} += "melody"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1 \
libsqlite3.so.0 \
libtag-c.so.0"

inherit rpm
