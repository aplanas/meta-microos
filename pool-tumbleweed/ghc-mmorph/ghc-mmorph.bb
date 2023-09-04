SUMMARY = "Monad morphisms"
DESCRIPTION = "This library provides monad morphism utilities, most commonly used for \
manipulating monad transformer stacks."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "ghc-mmorph-1.2.0-4.3.aarch64.rpm"
RPM_HASH = "cb4c439d2ca03c94b2245cf22df49a747aad5fe6da36b9000e6dd609e1a555c205ab8f3893b6ce204a20f31f2d884f25eab17e0793c4c3eace0f3f0bec9532b9"

RPROVIDES:${PN} += "ghc-mmorph \
libHSmmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
