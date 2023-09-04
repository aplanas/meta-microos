SUMMARY = "Haskell pandoc-types library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-types library documentation."
LICENSE = "GPL-2.0-only"

PV = "1.23.1"

RPM_NAME = "ghc-pandoc-types-doc-1.23.1-1.1.noarch.rpm"
RPM_HASH = "0ed6aa9be2cdac20d2ef823e834a01202cb341d8a86eeeacb638472d466598c68ebf14c58a3c1f5cb75ac7e0dac975d55bb5a0bcc96a945e850ee2a4d99aec6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
