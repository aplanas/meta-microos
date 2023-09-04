SUMMARY = "Optics as an abstract interface: core definitions"
DESCRIPTION = "This package makes it possible to define and use Lenses, Traversals, Prisms and \
other optics, using an abstract interface. \
 \
This variant provides core definitions with a minimal dependency footprint. \
See the '<https://hackage.haskell.org/package/optics optics>' package (and its \
dependencies) for documentation and the 'batteries-included' variant."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-optics-core-0.4.1.1-1.4.aarch64.rpm"
RPM_HASH = "25051c01399f6ce5b377a41865cb5cfd5862490476e0790e8047da871294bd18f8abd4c79184288ba2bf1629002b0ce0e63cb6274a0e8f5ba6be3783120067a9"

RPROVIDES:${PN} += "ghc-optics-core \
libHSoptics-core-0.4.1.1-GFxq3hBCaeZX1WvuRPRZs-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSindexed-profunctors-0.1.1.1-8VFnw8ahpDVCAreg6vEIe9-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
