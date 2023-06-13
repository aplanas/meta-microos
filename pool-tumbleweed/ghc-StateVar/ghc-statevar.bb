SUMMARY = "State variables"
DESCRIPTION = "This package contains state variables, which are references in the IO monad, \
like IORefs or parts of the OpenGL state."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-1.2.2-2.2.aarch64.rpm"
RPM_HASH = "12379cba54704b36aa30e38230de62005478d8810a1135673c8cfdb87dfe9ef9332b3ad8e1877cb2f50ec2a747b2437af8245e75e07f17db2884ab977b12c409"

RPROVIDES:${PN} += "ghc-StateVar \
ghc-StateVar(aarch-64) \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
