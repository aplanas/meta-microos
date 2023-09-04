SUMMARY = "Haskell terminfo library documentation"
DESCRIPTION = "This package provides the Haskell terminfo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-doc-0.4.1.5-1.1.noarch.rpm"
RPM_HASH = "fbfb6e3ce27f55387cf5e4320843156640b529a4545c8fe757a085019b247fee4438b1e97e328e081564befbc03404aae3e52c23eb57791283ad13b1f85c2025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminfo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
