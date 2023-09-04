SUMMARY = "Haskell sandi library documentation"
DESCRIPTION = "This package provides the Haskell sandi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-doc-0.5-5.11.noarch.rpm"
RPM_HASH = "879a30e2d5b553aadbab70d79c4ae04ae6bef0fbb7258d1a252bc975f830881d101b40563639603a7c6a6b225a0f9d8f05661b8766279e7c81e24a529fbb259a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-sandi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
