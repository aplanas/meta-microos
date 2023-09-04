SUMMARY = "HTML combinator library"
DESCRIPTION = "This package contains a combinator library for constructing HTML documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-1.0.1.2-4.3.aarch64.rpm"
RPM_HASH = "fe8192b79d6a649f2d10290f2bc6adeddd3cd05ac5f887babbbb787349750f51a8fa8790789fb342f6368b68f0538ec7435b2204d149f6c809cb3f22efa109da"

RPROVIDES:${PN} += "ghc-html \
libHShtml-1.0.1.2-Ei0LKBl3CyAHMF3GZI2hqu-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
