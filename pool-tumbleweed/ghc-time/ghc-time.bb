SUMMARY = "Haskell time library"
DESCRIPTION = "This package provides the Haskell time library."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-1.12.2-3.1.aarch64.rpm"
RPM_HASH = "ad6da0cd5ffd25f077436602eca6608574b9f150348e7ceb870335ef3dbe37181cab9eb4bb399fa617401c83d787a480f12fdb670c4536e08cdd87c5a042d492"

RPROVIDES:${PN} += "ghc-time \
ghc-time(aarch-64) \
libHStime-1.12.2-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
