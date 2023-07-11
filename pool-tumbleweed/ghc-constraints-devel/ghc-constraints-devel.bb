SUMMARY = "Haskell constraints library development files"
DESCRIPTION = "This package provides the Haskell constraints library development files."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-devel-0.13.4-2.6.aarch64.rpm"
RPM_HASH = "a8ca312cd5ffbfc20ddaf993e4f9bf3166bd4ee88a29995fd1192b7d5d10b8100c8d534e1ae432d338083c575175f33027412c5a3d5c177f336a9353b49f0a96"

RPROVIDES:${PN} += "ghc-constraints-devel \
ghc-devel-constraints-0.13.4-8c0InBhz3htJzug27IqVE7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-constraints \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-devel-type-equality-1-FqVAbwBXnIKCXHvrA6xdY8"

inherit rpm
