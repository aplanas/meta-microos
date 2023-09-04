SUMMARY = "Haskell DAV library documentation"
DESCRIPTION = "This package provides the Haskell DAV library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-doc-1.3.4-4.11.noarch.rpm"
RPM_HASH = "9462fa9cf3e3e5ec8a42a3cd732cb145fe5d0eb619336ec1608798076397cb029c259aeb7f547a5ae6dbd4b652d2f924ea43940a7b03703b1db335435953f6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-DAV-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
