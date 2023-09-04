SUMMARY = "Haskell tasty-hunit library documentation"
DESCRIPTION = "This package provides the Haskell tasty-hunit library documentation."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-doc-0.10.0.3-2.5.noarch.rpm"
RPM_HASH = "68f33c3bf463ab39cb42596de2693a98e641aab36080a6da50999ece69ba7cefa07a5d3e4c8df074c5d46adb9d4a5042d332824de7cf60bf65463add3439089a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-hunit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
