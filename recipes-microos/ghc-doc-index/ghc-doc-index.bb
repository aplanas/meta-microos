SUMMARY = "GHC library documentation indexing"
DESCRIPTION = "The package enables re-indexing of installed library documention."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-doc-index-9.4.5-3.1.noarch.rpm"
RPM_HASH = "cc31e816a435e20ca63c0ed7d3c49901cd8d755fa59844ee89a599173f54d9141d20c9342ad2ebdb5839d50a8931ae1130ca5b95499b4c12ca637a752d0883c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doc-index"
RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
