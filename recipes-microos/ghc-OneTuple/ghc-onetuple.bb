SUMMARY = "Singleton Tuple"
DESCRIPTION = "This package is a compatibility package for a singleton data type \
 \
> data Solo a = Solo a \
 \
Note: it's not a 'newtype' \
 \
'Solo' is available in 'base-4.16' (GHC-9.2)."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-OneTuple-0.3.1-4.2.aarch64.rpm"
RPM_HASH = "1aba5eadbeb12e20239a1659213c5d02d2c86e672dcd73b66d30613b723e6b948164cf0afe12e1e7d35469ec658eaf26e12435d1ccc8916e1b2a5e78f619fa5a"

RPROVIDES:${PN} += "ghc-OneTuple ghc-OneTuple(aarch-64) libHSOneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
