SUMMARY = "Haskell base profiling library"
DESCRIPTION = "This package provides the Haskell base profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.17.2.0"

RPM_NAME = "ghc-base-prof-4.17.2.0-1.1.aarch64.rpm"
RPM_HASH = "04853a787ecbc2ebcb3cf25f182d18c956048c1c30f4d14da0de5d7f08e9d03d2f44effe23ab8565c433df115dcebe47b228db9fcbfe582f03489ac76ac9ac84"

RPROVIDES:${PN} += "ghc-base-prof \
ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-bignum-1.3 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-integer-gmp-1.1 \
ghc-prof-rts-1.0.2"

RDEPENDS:${PN} += "ghc-base-devel \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
