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

RPM_NAME = "deja-dup-44.1-1.1.aarch64.rpm"
RPM_HASH = "db4b09469af581f2586c80bcb10225c00cae9630b30c70e8bb02957cd59fa2c82040fea6dc4e99620fdb8316c76aa701cf8417bd83e178988f17f53eeb952e58"

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
