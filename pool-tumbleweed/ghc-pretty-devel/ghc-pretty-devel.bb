SUMMARY = "Haskell pretty library development files"
DESCRIPTION = "This package provides the Haskell pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-devel-1.1.3.6-3.1.aarch64.rpm"
RPM_HASH = "13add3055a1b88301a803231efb1c0ef50ab4f4b4a18a357dc91a5949eac2a2379fd082318e9e05f3d73a5089f314bd03eda5dc9363efe8ae53a11f8dd661b6b"

RPROVIDES:${PN} += "ghc-devel(pretty-1.1.3.6) \
ghc-pretty-devel \
ghc-pretty-devel(aarch-64) \
ghc-pretty-static \
ghc-pretty-static(aarch-64)"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-pretty(aarch-64)"

inherit rpm
