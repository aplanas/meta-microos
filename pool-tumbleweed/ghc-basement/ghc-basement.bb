SUMMARY = "Foundation scrap box of array & string"
DESCRIPTION = "Foundation most basic primitives without any dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-0.0.16-1.5.aarch64.rpm"
RPM_HASH = "7d84f5bd7bd22c78d0154b9173cbdc55270c90e9c0fe647a95f5aa71da6a3e6501beff308609e8ae686b9b9e1875a7284efa99acc5d9b7ef8e9e60b24db7436d"

RPROVIDES:${PN} += "ghc-basement \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
