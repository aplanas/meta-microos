SUMMARY = "Column-based text sort engine"
DESCRIPTION = "Library to sort human readable column-based text output."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libsmartcols1-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "c2572c2bb9215faea0b3ed132fb856b631863d27064e4eec1c46d70a9a13da15b4c429e329d903f70a2c6346ce8b639fa9c912be30c0f2b49fffc413f9d09af8"

RPROVIDES:${PN} += "libsmartcols.so.1 \
libsmartcols1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
