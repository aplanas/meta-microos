SUMMARY = "Mail Program"
DESCRIPTION = "A very powerful mail user agent. It supports (among other nice things) \
highlighting, threading, and PGP. It takes some time to get used to, \
however. This version is based on NeoMutt, that is it includes many \
enhancements."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.10"

RPM_NAME = "mutt-2.2.10-2.1.aarch64.rpm"
RPM_HASH = "56ffa52c6e7f762ab5f394b3b246ff8c4ce5d53ed433cefe000093c8f6816e2d4e1447ae2d3b5927ba06ae31f02027f76a66c1fbc76470e7ce9b6a9be9ba7f1f"

RPROVIDES:${PN} += "application() \
application(mutt.desktop) \
config(mutt) \
mimehandler(x-scheme-handler/mailto) \
mutt \
mutt(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/cat \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/rm \
/usr/bin/zcat \
glibc-locale \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgpg-error.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libidn2.so.0()(64bit) \
libkyotocabinet.so.16()(64bit) \
libncursesw.so.6()(64bit) \
libsasl2.so.3()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit) \
shared-mime-info"

inherit rpm
