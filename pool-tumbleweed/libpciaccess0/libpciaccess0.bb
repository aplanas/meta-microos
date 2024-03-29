SUMMARY = "Generic PCI access library"
DESCRIPTION = "Provides functionality for X to access the PCI bus and devices in a \
platform-independent way."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "libpciaccess0-0.17-1.2.aarch64.rpm"
RPM_HASH = "f8598bce412e3a0501def8da7af9c2728a660d7a0c6e1d4516cf45095a12bef54763da5964f31603c3a2930b7626e61d0d22db5dc763ac4c3bf978943bc453d9"

RPROVIDES:${PN} += "libpciaccess.so.0 \
libpciaccess0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
