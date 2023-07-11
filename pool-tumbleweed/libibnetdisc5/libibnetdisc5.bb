SUMMARY = "Infiniband Net Discovery runtime library"
DESCRIPTION = "This package contains the Infiniband Net Discovery runtime library needed \
mainly by infiniband-diags."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibnetdisc5-45.0-1.2.aarch64.rpm"
RPM_HASH = "f247ab13e5a81940189df029dee4367b1f5706dcf235a459bc7121db7f6f1365de6d9e57755ec901863c93619f8614ef7657630dd68c88a530868739a6f527ba"

RPROVIDES:${PN} += "libibnetdisc.so.5 \
libibnetdisc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
