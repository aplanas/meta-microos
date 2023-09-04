SUMMARY = "Bindings to the ALSA simple mixer API"
DESCRIPTION = "This package provides bindings to the ALSA simple mixer API."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-alsa-mixer-0.3.0-4.3.aarch64.rpm"
RPM_HASH = "86a903ddc834ad8229a5275c0b363b142798ea3611f87fc648a73c385dab01b1088a129289cdce24c128cf5eb71d98a50b65cf12b7877e68c7d67c2795221703"

RPROVIDES:${PN} += "ghc-alsa-mixer \
libHSalsa-mixer-0.3.0-7vTOWVmX7tmF7GIGTcxaSH-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSalsa-core-0.5.0.1-5CJfdeELTf160s2ftizQdy-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSextensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libasound.so.2 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
