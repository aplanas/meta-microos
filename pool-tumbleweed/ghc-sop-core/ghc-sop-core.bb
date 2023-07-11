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

RPM_NAME = "ghc-sop-core-0.5.0.2-4.6.aarch64.rpm"
RPM_HASH = "6222b3d109d211877d72c022e72fff1eb71906ec1ca3cc4eb04af7d72dcc0d3da1706c6961c6f8be008760c9c3faccc7982b09d5fcac2ea84eb51d1b71d4e2c6"

RPROVIDES:${PN} += "ghc-sop-core \
libHSsop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
