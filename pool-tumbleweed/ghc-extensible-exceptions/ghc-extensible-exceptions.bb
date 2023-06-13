SUMMARY = "Extensible exceptions"
DESCRIPTION = "This package provides extensible exceptions for both new and old versions of \
GHC (i.e., < 6.10)."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-0.1.1.4-7.2.aarch64.rpm"
RPM_HASH = "c6241bc7594fb706d92ee737fa15e70becb5f8bf066fdb8b94e4767753e45e5d1cbd74cbae8ea638c74e4c84e4c739474e3cf225f497f5ec98d24037c43a4504"

RPROVIDES:${PN} += "ghc-extensible-exceptions \
ghc-extensible-exceptions(aarch-64) \
libHSextensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
