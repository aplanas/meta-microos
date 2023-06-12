SUMMARY = "Microlens support for Reader/Writer/State from mtl"
DESCRIPTION = "This package contains functions (like 'view' or '+=') which work on \
'MonadReader', 'MonadWriter', and 'MonadState' from the mtl package. \
 \
This package is a part of the <http://hackage.haskell.org/package/microlens \
microlens> family; see the readme <https://github.com/monadfix/microlens#readme \
on Github>."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.3"

RPM_NAME = "ghc-microlens-mtl-0.2.0.3-2.2.aarch64.rpm"
RPM_HASH = "172315dde33a89dbc29a09fe62a8a72202cfefc757b538b78d9af24cab6ca71aaf2b1ea884eae99a0f9541b9b90f890d2a3d2c8656d75afa9e5978d2e9e0ab33"

RPROVIDES:${PN} += "ghc-microlens-mtl \
ghc-microlens-mtl(aarch-64) \
libHSmicrolens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmicrolens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
