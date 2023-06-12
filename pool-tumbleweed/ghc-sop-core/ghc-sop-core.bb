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

RPM_NAME = "ghc-sop-core-0.5.0.2-4.3.aarch64.rpm"
RPM_HASH = "7392eb34babbe753fdd520df36a6b7820d82b3f58840e8ea191dd45fc695f1d34a7475fa58d448b6eced09340681a6cb531b649e4e3a538e518962f9d42c72a0"

RPROVIDES:${PN} += "ghc-sop-core \
ghc-sop-core(aarch-64) \
libHSsop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
