SUMMARY = "State variables"
DESCRIPTION = "This package contains state variables, which are references in the IO monad, \
like IORefs or parts of the OpenGL state."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "08d845738ef5fffd56b51d0eb49c00cdecc5ff527075d27f5e04ee0700c0c8acc98f92402285670284c730c989a569c27a3c8fa3ce7ac6090121df453fec2168"

RPROVIDES:${PN} += "ghc-StateVar \
libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
