SUMMARY = "Efficient hashing-based container types"
DESCRIPTION = "Efficient hashing-based container types. The containers have been optimized for \
performance critical use, both in terms of large data quantities and high \
speed. \
 \
The declared cost of each operation is either worst-case or amortized, but \
remains valid even if structures are shared. \
 \
/Security/ \
 \
This package currently provides no defenses against hash collision attacks such \
as HashDoS. Users who need to store input from untrusted sources are advised to \
use 'Data.Map' or 'Data.Set' from the 'containers' package instead."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-0.2.19.1-3.3.aarch64.rpm"
RPM_HASH = "a0185042245d14e80842c1475cb77e9e1cbc009f1459abf83b189f3e49432e855f9160017c4aa8da73b8a5debae4b835de08330fb5f60737b800cf45df58b7c1"

RPROVIDES:${PN} += "ghc-unordered-containers \
ghc-unordered-containers(aarch-64) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
