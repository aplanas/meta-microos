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

RPM_NAME = "ghc-monad-loops-0.4.3-11.2.aarch64.rpm"
RPM_HASH = "4d70a32e89cb7c51f2b03ceb9efc1654f9f09a40eb1344f2a1b2d3c38886aa9ced37b7950546cf7a16626ab9b4fddec8f04ad970f12569cf4b63837ce7161611"

RPROVIDES:${PN} += "ghc-monad-loops \
ghc-monad-loops(aarch-64) \
libHSmonad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
