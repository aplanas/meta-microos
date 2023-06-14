SUMMARY = "Development files for libasn1c, Osmocom's ASN.1 decoder and encoder library"
DESCRIPTION = "Compiles ASN.1 data structures into C source structures that can be \
simply (un)marshalled from and to: BER, DER, CER, BASIC-XER, CXER, \
EXTENDED-XER, PER. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libasn1c."
LICENSE = "BSD-2-Clause"

PV = "0.9.35"

RPM_NAME = "libasn1c-devel-0.9.35-1.1.aarch64.rpm"
RPM_HASH = "8e75c457d57c69e316c26c794ea3ff52dfdc5a332365325302a73c4098a9f6e6c1fc4145e802b0ca255be378d0a6c6d453ec213a8506a90b748e1bb5a0dcf040"

RPROVIDES:${PN} += "libasn1c-devel \
pkgconfig-libasn1c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libasn1c1 \
pkgconfig-talloc"

inherit rpm
