SUMMARY = "Haskell mtl library"
DESCRIPTION = "This package provides the Haskell mtl library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-2.2.2-3.2.aarch64.rpm"
RPM_HASH = "873ecedfe8803ec7f74fddfe34b5a789a8f3b204e9247350d282e5124a59f2b5c26039e8504c32697e19e1475569808bee666b5609a42e8faf7886b790a4957a"

RPROVIDES:${PN} += "ghc-mtl \
libHSmtl-2.2.2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
