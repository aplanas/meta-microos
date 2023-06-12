SUMMARY = "Haskell echo library documentation"
DESCRIPTION = "This package provides the Haskell echo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-doc-0.1.4-2.2.noarch.rpm"
RPM_HASH = "308f13567a2b8fdaf4f29aecc8af541b05531071bfbae877006aed01ba4290d5ecd5fc9c05c1af90924c192ee5cb58598d6e5bcae53d1fce5f7e1db269cd10b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-echo-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
