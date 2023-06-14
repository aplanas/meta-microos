SUMMARY = "Infiniband Net Discovery runtime library"
DESCRIPTION = "This package contains the Infiniband Net Discovery runtime library needed \
mainly by infiniband-diags."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibnetdisc5-45.0-1.1.aarch64.rpm"
RPM_HASH = "d38b046163411338edeaca26c972937c6df6ce44203068b6f4cd69fea62b697943a4d9cef245bf4a426eecb6e15372960108502f19aa7e0772c0f53c71ef3e1b"

RPROVIDES:${PN} += "libibnetdisc.so.5 \
libibnetdisc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
