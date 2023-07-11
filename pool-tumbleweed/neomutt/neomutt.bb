SUMMARY = "A command line mail reader (or MUA), a fork of Mutt with added features"
DESCRIPTION = "NeoMutt is a command line mail reader based on Mutt, brings together many \
new features. Can be installed in parallel with mutt."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-20230517-1.2.aarch64.rpm"
RPM_HASH = "2fb9ec215ae109eeadecdb89831a3a2e02b6a156e70071a2776dcc1cb55f04fb9983a0327f5cce75c0f6138f8dc4c8f8ce65df850ac55a61fe1b3eef05029f04"

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
