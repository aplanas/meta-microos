SUMMARY = "Lift computations from the bottom of a transformer stack"
DESCRIPTION = "This package provides a straightforward port of 'monadLib''s BaseM typeclass to \
'transformers'."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-transformers-base-0.4.6-2.3.aarch64.rpm"
RPM_HASH = "879badc689ec79be4a378b7255a9c3513f7ce0a210271d5d0781a291028f9c399608a73293c43c4d537f84047a067de3af9749a1df0c57659030c3bbae9c2df9"

RPROVIDES:${PN} += "ghc-transformers-base \
libHStransformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
