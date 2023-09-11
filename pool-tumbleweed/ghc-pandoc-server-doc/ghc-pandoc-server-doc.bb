SUMMARY = "Haskell pandoc-server library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-server library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.3"

RPM_NAME = "ghc-pandoc-server-doc-0.1.0.3-1.1.noarch.rpm"
RPM_HASH = "c9543e1537b3a1a259a322317bf3fb0ba93a61dcf3698fa72efd09089159256d6be508b8b254d3a8965968f19f9dc0b5ddbe8ac9904500ff8bafbf443c6e774f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
