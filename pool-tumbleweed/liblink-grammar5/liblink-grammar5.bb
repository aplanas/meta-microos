SUMMARY = "An English grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of a number of \
languages, based on Link Grammar, an original theory of syntax and \
morphology."
LICENSE = "LGPL-2.1-only"

PV = "5.10.5"

RPM_NAME = "liblink-grammar5-5.10.5-1.6.aarch64.rpm"
RPM_HASH = "276b63dd3a411f9cdb77c2729b7cd11e1f4ca196597f3a2e0f7509997288fa5ae458f2920ec27ff6661e3275aa52dd076a637192fc8d11508869b849357b839a"

RPROVIDES:${PN} += "liblink-grammar.so.5 \
liblink-grammar5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhunspell-1.7.so.0 \
libpcre2-8.so.0 \
libsqlite3.so.0"

inherit rpm
