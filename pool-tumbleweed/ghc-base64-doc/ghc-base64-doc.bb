SUMMARY = "Haskell base64 library documentation"
DESCRIPTION = "This package provides the Haskell base64 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-doc-0.4.2.4-3.9.noarch.rpm"
RPM_HASH = "3944b7cd93346f850197c2ab9de448c9ac29943c42e7a7b57c5e5250c12493a216eb8179cc63890e8301ad9c5e9f969a2ce7c1e49d30fee49659efa2f81e98fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
