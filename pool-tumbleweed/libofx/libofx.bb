SUMMARY = "OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.5"

RPM_NAME = "libofx-0.10.5-1.6.aarch64.rpm"
RPM_HASH = "cce530968c46a5471e6397ec1d4234bee9c1db2b4ea26398b4d668d8596a92800e41c992df9da16eb581727fea3795317d49de846b5274b0176beb24346f6ced"

RPROVIDES:${PN} += "libofx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libofx.so.7 \
libstdc++.so.6 \
libxml++-2.6.so.2"

inherit rpm
