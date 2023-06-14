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

RPM_NAME = "ghc-transformers-compat-0.7.2-2.3.aarch64.rpm"
RPM_HASH = "e7c4c6171eaa96943cb3ac82c599f6e99a4918ff2593b7fc2e2cb4bbbf457cc59dceb1a3a7b43215ff06bfd4f023fa4aa0cb3e5e5c1281faaa85187f2d4b08c5"

RPROVIDES:${PN} += "ghc-transformers-compat \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
