SUMMARY = "Haskell split library documentation"
DESCRIPTION = "This package provides the Haskell split library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-split-doc-0.2.3.5-2.3.noarch.rpm"
RPM_HASH = "be34fd2340a03d4f50509f071ef659b459d9a76c0ca2b5c487d5d66df3b13489d80c57bcb3e12b914cebb72bae532607f106b241f104ad606eb8552cbd50c1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-split-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
