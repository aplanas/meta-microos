SUMMARY = "Haskell bencode library documentation"
DESCRIPTION = "This package provides the Haskell bencode library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-doc-0.6.1.1-4.8.noarch.rpm"
RPM_HASH = "1a2f92163c9914ff1d71850f9b89023ecf76f89450035b4f872163b3d35d8542cf3f06d0761d7e9869f85c0f00e2d23dae3ab66f58817ec3e987bc64237dfbbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bencode-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
