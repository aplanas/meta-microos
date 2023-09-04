SUMMARY = "Haskell disk-free-space library documentation"
DESCRIPTION = "This package provides the Haskell disk-free-space library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-doc-0.1.0.1-5.3.noarch.rpm"
RPM_HASH = "4aee118a9c129e9c2cc84d5c38cf4ea3795915a8b7660531ad96fef87d48038b0df13072d13ebb4633445c06df72bbd21590af18e886f1b9c52f10b404581749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-disk-free-space-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
