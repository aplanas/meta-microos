SUMMARY = "Mail Program"
DESCRIPTION = "A very powerful mail user agent. It supports (among other nice things) \
highlighting, threading, and PGP. It takes some time to get used to, \
however. This version is based on NeoMutt, that is it includes many \
enhancements."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.10"

RPM_NAME = "mutt-2.2.10-2.2.aarch64.rpm"
RPM_HASH = "805d399d515a80a321ca08ab5fb31214dcc30eb093374bbdd77de36667d8226166c95343a39d3668dc3783b1f444e021c9318c9b02f5bfeb275aa45703fca1fc"

RPROVIDES:${PN} += "config-mutt \
mutt"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/rm \
/usr/bin/sh \
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
