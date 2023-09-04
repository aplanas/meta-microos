SUMMARY = "Infiniband Net Discovery runtime library"
DESCRIPTION = "This package contains the Infiniband Net Discovery runtime library needed \
mainly by infiniband-diags."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibnetdisc5-47.0-2.2.aarch64.rpm"
RPM_HASH = "26a827b85ea6fce56ffde6bc0c7175a351fe7d126f1ee7f9968cd373abbe127919a491c501baea1e8a0fa5927a4a56c0b6b344184ab0ece599769be26c5b6eee"

RPROVIDES:${PN} += "libibnetdisc.so.5 \
libibnetdisc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
