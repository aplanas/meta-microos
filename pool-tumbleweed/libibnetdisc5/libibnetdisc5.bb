SUMMARY = "Infiniband Net Discovery runtime library"
DESCRIPTION = "This package contains the Infiniband Net Discovery runtime library needed \
mainly by infiniband-diags."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibnetdisc5-47.0-1.1.aarch64.rpm"
RPM_HASH = "44a45fae93540cd3f8b00d739c535b02fc54ba4b12c21b196a76756a74cf147ef092b1997269351e5117374a65966060fe310a13587e671d21a12f9e5575e406"

RPROVIDES:${PN} += "libibnetdisc.so.5 \
libibnetdisc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
