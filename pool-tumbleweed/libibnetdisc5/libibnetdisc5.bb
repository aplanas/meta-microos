SUMMARY = "Infiniband Net Discovery runtime library"
DESCRIPTION = "This package contains the Infiniband Net Discovery runtime library needed \
mainly by infiniband-diags."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibnetdisc5-47.0-3.1.aarch64.rpm"
RPM_HASH = "6ea1b9ee38cb49ee7b44590acab8396e7fc39c728928fde930a4fc74e1f0eb93c68420272a8c6f93c3281bd413253341d160d8dbed87461b8ccba1f636c32828"

RPROVIDES:${PN} += "libibnetdisc.so.5 \
libibnetdisc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
