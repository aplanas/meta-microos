SUMMARY = "Haskell time library"
DESCRIPTION = "This package provides the Haskell time library."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "b2211dad84f3d3d030b30bc133da7531d43718df3109bc0f9fbaefb9c88316becd943d521edf643f7859fa328c059e623bbcf3a21f4441479cab460471b0eab7"

RPROVIDES:${PN} += "ghc-time \
libHStime-1.12.2-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
