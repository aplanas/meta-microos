SUMMARY = "Optics as an abstract interface: core definitions"
DESCRIPTION = "This package makes it possible to define and use Lenses, Traversals, Prisms and \
other optics, using an abstract interface. \
 \
This variant provides core definitions with a minimal dependency footprint. \
See the '<https://hackage.haskell.org/package/optics optics>' package (and its \
dependencies) for documentation and the 'batteries-included' variant."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-optics-core-0.4.1.1-1.2.aarch64.rpm"
RPM_HASH = "afed3bb86acbc5991dd7bb03091e2bab4f8be4f98a3f176ff72c880c00cb9a9dd3646c30414601bb2398d0fa5890c0a27869893cb9d85b6948a76ff6020143aa"

RPROVIDES:${PN} += "ghc-optics-core \
libHSoptics-core-0.4.1.1-JC1QypotRRZA0HNSE7diFW-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSindexed-profunctors-0.1.1.1-6bLFHbFbToS4H5mdmvIfka-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
