SUMMARY = "Haskell lifted-base library documentation"
DESCRIPTION = "This package provides the Haskell lifted-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-doc-0.2.3.12-8.3.noarch.rpm"
RPM_HASH = "da7b025f52c98b0dda9b8e367278604ff6601aab09e8df33bb8a8f207236a73ddc2f2b5f18e68a47e9ff20e19f866248dbb4888be356c9380bc79cf23a99e2b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lifted-base-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
