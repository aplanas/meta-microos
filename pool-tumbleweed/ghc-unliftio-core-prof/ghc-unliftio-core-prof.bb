SUMMARY = "Haskell unliftio-core profiling library"
DESCRIPTION = "This package provides the Haskell unliftio-core profiling library."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-prof-0.2.1.0-1.6.aarch64.rpm"
RPM_HASH = "65907aecc225dc0b28e115958665bb49a52c202f25f7d5738847195c440e3695fff028093f56b1774ec57a9038888dad7b3516808975c8f94ce1dfedcf0d5840"

RPROVIDES:${PN} += "ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-unliftio-core-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-unliftio-core-devel"

inherit rpm
