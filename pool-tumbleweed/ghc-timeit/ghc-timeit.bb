SUMMARY = "Time monadic computations with an IO base"
DESCRIPTION = "A simple wrapper to show the used CPU time of monadic computation with an IO \
base."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-2.0-6.2.aarch64.rpm"
RPM_HASH = "77a5efa35b62993cbf6ededd3f7bc24fb121867e0d0475dad690ad5dd629192ee9c80fa6b85aff6b2b620e98b8cbea9e5eeabeb19badddaf2a76d2b742a58986"

RPROVIDES:${PN} += "ghc-timeit \
ghc-timeit(aarch-64) \
libHStimeit-2.0-8ewEVtFbCiRSME6yb7iQx-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
