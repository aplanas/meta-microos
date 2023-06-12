SUMMARY = "Haskell mmorph library documentation"
DESCRIPTION = "This package provides the Haskell mmorph library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "ghc-mmorph-doc-1.2.0-4.2.noarch.rpm"
RPM_HASH = "52a2f307555797560003df6f8c744eb40711f5390a4c8b1ff9873ea065a8b1dc0638fe8a86313ae38db3a660e1af25519cd3abda8ac2c3ac794914eab76daede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mmorph-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
