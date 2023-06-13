SUMMARY = "Haskell base library"
DESCRIPTION = "This package provides the Haskell base library."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-4.17.1.0-3.1.aarch64.rpm"
RPM_HASH = "7449b5871c855750529fc5e7217a59b587796f581feed010040d6b5352e30f6ef5b4bbaa3f28f7145d72d7b98666051aafb713ecaf2266682804f860992173c9"

RPROVIDES:${PN} += "ghc-base \
ghc-base(aarch-64) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSinteger-gmp-1.1-ghc9.4.5.so()(64bit) \
libHSrts-1.0.2-ghc9.4.5.so()(64bit) \
libHSrts-1.0.2_debug-ghc9.4.5.so()(64bit) \
libHSrts-1.0.2_thr-ghc9.4.5.so()(64bit) \
libHSrts-1.0.2_thr_debug-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libffi.so.8()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libnuma.so.1()(64bit)"

inherit rpm
