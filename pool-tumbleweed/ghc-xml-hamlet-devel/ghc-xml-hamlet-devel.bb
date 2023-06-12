SUMMARY = "Haskell xml-hamlet library development files"
DESCRIPTION = "This package provides the Haskell xml-hamlet library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-devel-0.5.0.2-2.3.aarch64.rpm"
RPM_HASH = "c189123cfc87a0ec43f3d596dc2c8d588de4cb5eb3f5ba87439117a34ff132e09a231103cd11af312530a399bdd11bf38390928d17dd6e61108db5f20da4d9b7"

RPROVIDES:${PN} += "ghc-devel(xml-hamlet-0.5.0.2-IdxjO6rnbTj7Ym5G4XopFP) \
ghc-xml-hamlet-devel \
ghc-xml-hamlet-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-devel(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) \
ghc-xml-hamlet"

inherit rpm
