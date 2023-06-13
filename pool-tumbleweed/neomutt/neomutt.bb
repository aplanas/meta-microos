SUMMARY = "A command line mail reader (or MUA), a fork of Mutt with added features"
DESCRIPTION = "NeoMutt is a command line mail reader based on Mutt, brings together many \
new features. Can be installed in parallel with mutt."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-20230517-1.1.aarch64.rpm"
RPM_HASH = "dee320ba092eda40e8045392b74af71b5b122392f52c501f7aa5f98eeae6dec9f4d80694f775397462f2b5b17180aa173e8d4f35fa8f2c8804f51f7977598842"

RPROVIDES:${PN} += "config(neomutt) \
neomutt \
neomutt(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgpgme.so.11()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libidn2.so.0()(64bit) \
libkyotocabinet.so.16()(64bit) \
liblmdb-0.9.30.so()(64bit) \
liblua5.4.so.5()(64bit) \
libncursesw.so.6()(64bit) \
libnotmuch.so.5()(64bit) \
libpcre2-8.so.0()(64bit) \
libsasl2.so.3()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
