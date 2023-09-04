SUMMARY = "Column-based text sort engine"
DESCRIPTION = "Library to sort human readable column-based text output."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libsmartcols1-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "06467b34c71376ae698a4598f05c06cbf732f57d0322b162ba3c79815b2f729ccd081a38e88c0b6163320bd6b5992ca889624bc54e80317073fb88b7d098afcb"

RPROVIDES:${PN} += "libsmartcols.so.1 \
libsmartcols1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
