SUMMARY = "Column-based text sort engine"
DESCRIPTION = "Library to sort human readable column-based text output."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols1-2.39-2.1.aarch64.rpm"
RPM_HASH = "dec0ad2ec86e56f8fdde0aa2f43e67e2a8cd48b7220c4d841cc6d2edad09d57aa7f7edac090a2fa2cb6a4e50919982c83ccc490866ef939a080e47ad56aa301e"

RPROVIDES:${PN} += "libsmartcols.so.1 \
libsmartcols1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
