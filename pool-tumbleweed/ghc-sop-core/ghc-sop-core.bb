SUMMARY = "True Sums of Products"
DESCRIPTION = "Implementation of n-ary sums and n-ary products. \
 \
The module 'Data.SOP' is the main module of this library and contains more \
detailed documentation. \
 \
The main use case of this package is to serve as the core of \
'<https://hackage.haskell.org/package/generics-sop generics-sop>'. \
 \
A detailed description of the ideas behind this library is provided by the \
paper: \
 \
* Edsko de Vries and Andres Löh. \
<http://www.andres-loeh.de/TrueSumsOfProducts True Sums of Products>. \
Workshop on Generic Programming (WGP) 2014."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-0.5.0.2-4.8.aarch64.rpm"
RPM_HASH = "b67aed557383394e415e103bcb0d695f998f3464190b250d7fb755794c3a898a5447a31985de288a7f44a0c1b97793a9cf80bbb415fa2a987189d073dc8e8f9e"

RPROVIDES:${PN} += "ghc-sop-core \
libHSsop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
