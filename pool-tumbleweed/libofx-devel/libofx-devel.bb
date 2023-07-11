SUMMARY = "Development files for libofx, an OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads. \
 \
This subpackage contains the header files for the C API."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.5"

RPM_NAME = "libofx-devel-0.10.5-1.7.aarch64.rpm"
RPM_HASH = "d6c9e73615ff1a03fe48b307495042dae9bb395a74a88ceec0ad190480770b61c22c99d66509c9701a0b0d34967487bdfed885717a025682f7b2cc59219d0b78"

RPROVIDES:${PN} += "libofx-devel \
pkgconfig-libofx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libofx \
libofx7"

inherit rpm
