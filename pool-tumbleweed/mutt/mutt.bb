SUMMARY = "Mail Program"
DESCRIPTION = "A very powerful mail user agent. It supports (among other nice things) \
highlighting, threading, and PGP. It takes some time to get used to, \
however. This version is based on NeoMutt, that is it includes many \
enhancements."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.10"

RPM_NAME = "mutt-2.2.10-2.1.aarch64.rpm"
RPM_HASH = "56ffa52c6e7f762ab5f394b3b246ff8c4ce5d53ed433cefe000093c8f6816e2d4e1447ae2d3b5927ba06ae31f02027f76a66c1fbc76470e7ce9b6a9be9ba7f1f"

RPROVIDES:${PN} += "config-mutt \
mutt"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/cat \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/rm \
/usr/bin/zcat \
glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgpg-error.so.0 \
libgpgme.so.11 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libkyotocabinet.so.16 \
libncursesw.so.6 \
libsasl2.so.3 \
libtinfo.so.6 \
libz.so.1 \
shared-mime-info"

inherit rpm
