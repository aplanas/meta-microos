SUMMARY = "Simple backup tool and frontend for duplicity"
DESCRIPTION = "Déjà  Dup is a simple backup tool. It hides the complexity of doing \
backups the 'right way' (encrypted, off-site, and regular) and uses \
duplicity as the backend. \
 \
Features: \
 * Support for local or remote backup locations, including Amazon S3 \
 * Securely encrypts and compresses your data \
 * Incrementally backs up, letting you restore from any particular backup \
 * Schedules regular backups \
 * Integrates well into your GNOME desktop"
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "deja-dup-44.1-1.2.aarch64.rpm"
RPM_HASH = "0cedbd064ae769d3130472a3bbcc17f98540c61cf1c706679074b86e5d51e9d79008b236f7ad53ad11756bd2597fc33c15b8308b2480dd5d4633a02e900b3055"

RPROVIDES:${PN} += "deja-dup \
libdeja.so"

RDEPENDS:${PN} += "/usr/bin/sh \
duplicity \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
python3-oauthlib"

inherit rpm
