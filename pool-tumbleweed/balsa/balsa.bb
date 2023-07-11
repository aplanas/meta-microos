SUMMARY = "The GNOME Mail Program"
DESCRIPTION = "An e-mail client for GNOME. It supports \
* the local mailbox formats mbox, maildir and mh \
* MIME support, nested mailboxes \
* POP3 and IMAP mail access \
* printing, spell checking \
* address book with GnomeCard \
* GPG/OpenPGP mail signing and encryption"
LICENSE = "GPL-2.0-or-later"

PV = "2.6.4"

RPM_NAME = "balsa-2.6.4-2.4.aarch64.rpm"
RPM_HASH = "cb54d1bbb60fc1393159168cfa4fcf54a76a7abb16f624e5a44353e51c10214df1331cdd25cdb5e777ac3f2f3a178ea927c65c1d5700e0c4c4d68bb1ecfed86e"

RPROVIDES:${PN} += "balsa \
config-balsa \
libhtmlfilter.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libcompface.so.1 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgspell-1.so.2 \
libgssapi-krb5.so.2 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libical.so.3 \
liblber.so.2 \
libldap.so.2 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0 \
libsqlite3.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
