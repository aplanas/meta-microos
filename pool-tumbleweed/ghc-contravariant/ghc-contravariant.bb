SUMMARY = "Contravariant functors"
DESCRIPTION = "Contravariant functors."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-1.5.5-2.6.aarch64.rpm"
RPM_HASH = "3876ffbec7ca334ac8099d4e491f008f63261b64726757de041c99ecb8be69ce86840848d843695d16d24c06b38f54352780967af01eda5af54b546a4466b3bf"

RPROVIDES:${PN} += "ghc-contravariant \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
