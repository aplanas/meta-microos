SUMMARY = "Haskell containers library development files"
DESCRIPTION = "This package provides the Haskell containers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-devel-0.6.7-1.1.aarch64.rpm"
RPM_HASH = "c0d2d3e07f808a6ec3abe8e92f8f250b90276e9ad259b635bde52bbdac42e8a05d22c5861e0ab5cdfc8b03c7ab01928ff10fd0935aa750c4ded866c489b576e9"

RPROVIDES:${PN} += "ghc-containers-devel \
ghc-containers-static \
ghc-devel-containers-0.6.7"

RDEPENDS:${PN} += "ghc-compiler \
ghc-containers \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-template-haskell-2.19.0.0"

inherit rpm
