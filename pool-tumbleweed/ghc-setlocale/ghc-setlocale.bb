SUMMARY = "Haskell bindings to setlocale"
DESCRIPTION = "Haskell bindings to setlocale."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-1.0.0.10-4.2.aarch64.rpm"
RPM_HASH = "d7a879deace01cbd5b521b87edc5524243a014e0daca939cb555eb1516d2a4341de78731399d773832c959c3178e0bc9172ca8d600c6891fcbf9b700f6e73965"

RPROVIDES:${PN} += "ghc-setlocale \
ghc-setlocale(aarch-64) \
libHSsetlocale-1.0.0.10-8gNxxDe254d2fufYktFd7s-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
