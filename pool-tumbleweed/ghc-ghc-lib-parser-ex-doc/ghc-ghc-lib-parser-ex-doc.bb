SUMMARY = "Haskell ghc-lib-parser-ex library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-doc-9.4.0.0-1.3.noarch.rpm"
RPM_HASH = "0a63175cdcdb284e21a2c08c06de39bc9fee774ab5bfe649d4307c3d89975469428f200f53bc37c1a08023a02d57c8f9986b1de70e34f9ca2af1a9a56edff2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
