SUMMARY = "Haskell lucid library documentation"
DESCRIPTION = "This package provides the Haskell lucid library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-doc-2.11.20230408-1.2.noarch.rpm"
RPM_HASH = "cf2bfeb7492429cac90bc3df9d064743f6b9674f9436664e0da96dff1391ddab40bacdfb055d59a207edfed3caff31d527b3ee66af8b005823ab2ac0f9a69158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lucid-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
