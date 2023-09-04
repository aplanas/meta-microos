SUMMARY = "ATSC A/52 stream decoder library"
DESCRIPTION = "liba52 is a library for decoding ATSC A/52 streams. \
Shared library part of a52dec."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "liba52-0-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "ad225e6ed06ba7fbfe4d118b56aa8ade092696a5b29f8cc81754c4cfab330961f61d154d8413fe4eb42eaac37fd399fe8465e1d3c354cedad611c548ca9994ad"

RPROVIDES:${PN} += "liba52 \
liba52-0 \
liba52.so.0 \
liba52dec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
