SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "MPEG 1.0/2.0/2.5 audio decoder library for layers 1, 2 and 3 (most \
commonly MPEG 1.0 Layer 3 aka MP3)."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "libmpg123-0-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "f6f2b45595fe1134f7b9af895d533363882770a575619b137c9afcdef43c62f67f9de81f61c58804e139255478bde3964e3822ab4d0feca5dcf996cb077705fa"

RPROVIDES:${PN} += "libmpg123-0 \
libmpg123.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
