SUMMARY = "Haskell constraints profiling library"
DESCRIPTION = "This package provides the Haskell constraints profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-prof-0.13.4-2.3.aarch64.rpm"
RPM_HASH = "dd37262ae221c069bde506eb095e246d2472baf93051d3f89063ea0273713b9107b2ea2a89335afca7e4f34c22073cebaf0eb290d6305eef40d8597ac26b8e30"

RPROVIDES:${PN} += "ghc-constraints-prof \
ghc-prof-constraints-0.13.4-8c0InBhz3htJzug27IqVE7"

RDEPENDS:${PN} += "ghc-constraints-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-type-equality-1-FqVAbwBXnIKCXHvrA6xdY8"

inherit rpm
