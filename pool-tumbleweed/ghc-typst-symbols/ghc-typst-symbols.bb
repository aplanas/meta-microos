SUMMARY = "Symbol and emoji lookup for typst language"
DESCRIPTION = "This package defines symbol and emoji codes for the typst language \
(<https://typst.app>)."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ghc-typst-symbols-0.1.4-1.1.aarch64.rpm"
RPM_HASH = "2de074feda16d999bda2272ae15763dfde716bc922726a9f3db8dd8bef7fa4e2912f157c8bdff231a4e35bb404ca49a9621106b04da46205ab67bdf38b611dca"

RPROVIDES:${PN} += "ghc-typst-symbols \
libHStypst-symbols-0.1.4-JaoP2leChnCACsgYhrK1kO-ghc9.4.6.so"

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
