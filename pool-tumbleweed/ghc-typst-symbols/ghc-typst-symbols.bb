SUMMARY = "Symbol and emoji lookup for typst language"
DESCRIPTION = "This package defines symbol and emoji codes for the typst language \
(<https://typst.app>)."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-typst-symbols-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "ed54bdc073b388cb1d657d133895be26919194fdaf984dea842f634c401a516fdef04736c2c52d9f95036825f803b7bae096010314819fc0218e555469b1a3ba"

RPROVIDES:${PN} += "ghc-typst-symbols \
libHStypst-symbols-0.1.2-3u6ALqSoiYt5j197EL0vRB-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
