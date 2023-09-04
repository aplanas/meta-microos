SUMMARY = "Haskell blaze-builder library documentation"
DESCRIPTION = "This package provides the Haskell blaze-builder library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-doc-0.4.2.2-3.8.noarch.rpm"
RPM_HASH = "af8fef2f448ce58b84868271918130e62db95d5599e8b366d5264423c2808c7e09cf1eca38f948ba612bb0a9caf27bb045b0f45f232967b3fca43a5872d79b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-builder-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
