SUMMARY = "O(ND) diff algorithm in haskell"
DESCRIPTION = "Implementation of the standard diff algorithm, and utilities for pretty \
printing."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-0.4.1-2.3.aarch64.rpm"
RPM_HASH = "58c03cdf17cb0dcd7b8bfbeeb89e8eb978a05a002494245c9a673379526e5ba96de9dcd260ea011f573e09ba1189fe2795eafa5d794c1d5ce9e66d8ec70b96de"

RPROVIDES:${PN} += "ghc-Diff \
ghc-Diff(aarch-64) \
libHSDiff-0.4.1-CiDqeLEcsRQOQjfgZOPVP-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
