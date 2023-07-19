SUMMARY = "Column-based text sort engine"
DESCRIPTION = "Library to sort human readable column-based text output."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols1-2.39-3.1.aarch64.rpm"
RPM_HASH = "2fefc7ca2ee9856b1ee963abb5ca2454420a61723fb686af60032e7e58d2e0c42ce459692cc89d06125a3cadfa76aded7743f8be49a9992aea013b46343b210c"

RPROVIDES:${PN} += "libsmartcols.so.1 \
libsmartcols1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
