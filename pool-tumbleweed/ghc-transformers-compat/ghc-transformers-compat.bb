SUMMARY = "A small compatibility shim for the transformers library"
DESCRIPTION = "This package includes backported versions of types that were added to \
transformers in transformers 0.3, 0.4, and 0.5 for users who need strict \
transformers 0.2 or 0.3 compatibility to run on old versions of the platform, \
but also need those types. \
 \
Those users should be able to just depend on 'transformers >= 0.2' and \
'transformers-compat >= 0.3'. \
 \
Note: missing methods are not supplied, but this at least permits the types to \
be used."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-0.7.2-2.8.aarch64.rpm"
RPM_HASH = "b901cb1286e9803335cb3ea7723bb348fb0aeb62b493c317196df28365a75b9601b6a1d7d5d9e5d9cd584d4ca2a75c6479e75f1c49c43960e4999c46d01753eb"

RPROVIDES:${PN} += "ghc-transformers-compat \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
