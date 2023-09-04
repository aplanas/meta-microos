SUMMARY = "Monadic loops"
DESCRIPTION = "Some useful control operators for looping. \
 \
New in 0.4: STM loop operators have been split into a new package instead of \
being conditionally-built. \
 \
New in 0.3.2.0: various functions for traversing lists and computing \
minima/maxima using arbitrary procedures to compare or score the elements."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-0.4.3-11.3.aarch64.rpm"
RPM_HASH = "cbe94545d7c7fadab59fa7e517366c344f1e12eff2182e244f814f08b4a05963de090b36196667914791d06edf2030808851764c0d234957e6f8b8a4b08f4207"

RPROVIDES:${PN} += "ghc-monad-loops \
libHSmonad-loops-0.4.3-Hqvq9oJQAvl8Gm82ocTn8i-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
