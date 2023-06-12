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

RPM_NAME = "balsa-2.6.4-2.3.aarch64.rpm"
RPM_HASH = "ce8d1083aa86d13b571c223e9076c2ab9e0e0fa0ef8875c6ccb792db8b60eceb55dee4889f3eabe18a5ee5e7ed4c932a675b2481daf4239bbdf49bd76f03fd5c"

RPROVIDES:${PN} += "application() \
application(balsa-mailto-handler.desktop) \
application(org.desktop.Balsa.desktop) \
balsa \
balsa(aarch-64) \
config(balsa) \
libhtmlfilter.so()(64bit) \
metainfo() \
metainfo(balsa.appdata.xml) \
mimehandler(x-scheme-handler/mailto)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libcompface.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmime-3.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libgspell-1.so.2()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libical.so.3()(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
