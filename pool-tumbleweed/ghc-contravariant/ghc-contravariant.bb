SUMMARY = "Contravariant functors"
DESCRIPTION = "Contravariant functors."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-1.5.5-2.3.aarch64.rpm"
RPM_HASH = "14b66a2c659540ec8b50048454b996447d14a4284973fee7704b493f1a4cb1f56d903c0f679b9dc694cb14a6cae98baacb0276618e80dbce73f1f544a1e6ffb6"

RPROVIDES:${PN} += "ghc-contravariant \
ghc-contravariant(aarch-64) \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm