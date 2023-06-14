SUMMARY = "Haskell bytestring library"
DESCRIPTION = "This package provides the Haskell bytestring library."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-0.11.4.0-3.1.aarch64.rpm"
RPM_HASH = "6035b102a7033d0802b2c89160686b67b7116d801605cc1747e359e7409b73b2b0d85ee80e0681fcf776507d0ca91905a2ff93e753a14a2f9f830bcc2bbde226"

RPROVIDES:${PN} += "ghc-bytestring \
libHSbytestring-0.11.4.0-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
