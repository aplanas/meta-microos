SUMMARY = "Haskell setlocale library documentation"
DESCRIPTION = "This package provides the Haskell setlocale library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-doc-1.0.0.10-4.2.noarch.rpm"
RPM_HASH = "800f67f333e1ea62196496df97e03ef88aac3b2ec27148033f14fcd090302e5c7643f3018e61a9cd53ebd69ee1e6f9518652fc8d08c611f92a9f809e1a429c90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-setlocale-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
