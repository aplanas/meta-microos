SUMMARY = "Symbol and emoji lookup for typst language"
DESCRIPTION = "This package defines symbol and emoji codes for the typst language \
(<https://typst.app>)."
LICENSE = "MIT"

PV = "0.1.0.1"

RPM_NAME = "ghc-typst-symbols-0.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "5dc4595312ad0f00475162640b0c1488128236d63d9fccae67ed59618710914ed7bac41f9dbfae0e1752733d37a4c74708c85a494d0d039a68ea3986317f6a98"

RPROVIDES:${PN} += "ghc-typst-symbols \
libHStypst-symbols-0.1.0.1-68asM8ctSWGeebFauBl8u-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
