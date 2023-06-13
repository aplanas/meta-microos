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

RPROVIDES:${PN} += "application() \
application(org.gnome.DejaDup.desktop) \
deja-dup \
deja-dup(aarch-64) \
libdeja.so()(64bit) \
metainfo() \
metainfo(org.gnome.DejaDup.metainfo.xml) \
mimehandler(x-scheme-handler/com.googleusercontent.apps.916137916439-evn6skqan91m96fmsskk8102e3iepv22) \
mimehandler(x-scheme-handler/msale6c2a4b2-6238-47df-9fc9-5b78941dd679)"

RDEPENDS:${PN} += "/bin/sh \
duplicity \
ld-linux-aarch64.so.1()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
python3-oauthlib"

inherit rpm
