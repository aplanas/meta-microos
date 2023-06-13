SUMMARY = "Haskell pandoc-server library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-server library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "ghc-pandoc-server-doc-0.1-1.5.noarch.rpm"
RPM_HASH = "033144b94f3aac37138bd9a338177e030e392e0f0a521dce9563a5a8fc614170aff3854b47a121f79590248b28237bc9333ff479fbd731a81bf35894979f0500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
