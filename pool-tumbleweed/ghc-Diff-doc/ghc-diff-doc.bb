SUMMARY = "Haskell Diff library documentation"
DESCRIPTION = "This package provides the Haskell Diff library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-doc-0.4.1-2.6.noarch.rpm"
RPM_HASH = "170369e6609186434140b8d9e00fd72d0460611b5094344b18eb8ed450288b0e625c904ed65a9bf63b832885ac942f04ae7903cc5203fdca7d1981768945f1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Diff-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
