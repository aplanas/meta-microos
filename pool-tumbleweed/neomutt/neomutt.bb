SUMMARY = "A command line mail reader (or MUA), a fork of Mutt with added features"
DESCRIPTION = "NeoMutt is a command line mail reader based on Mutt, brings together many \
new features. Can be installed in parallel with mutt."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-20230517-1.1.aarch64.rpm"
RPM_HASH = "dee320ba092eda40e8045392b74af71b5b122392f52c501f7aa5f98eeae6dec9f4d80694f775397462f2b5b17180aa173e8d4f35fa8f2c8804f51f7977598842"

RPROVIDES:${PN} += "config-neomutt \
neomutt"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgpgme.so.11 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libkyotocabinet.so.16 \
liblmdb-0.9.30.so \
liblua5.4.so.5 \
libncursesw.so.6 \
libnotmuch.so.5 \
libpcre2-8.so.0 \
libsasl2.so.3 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
