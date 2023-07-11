SUMMARY = "Haskell xss-sanitize library documentation"
DESCRIPTION = "This package provides the Haskell xss-sanitize library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-doc-0.3.7.2-1.6.noarch.rpm"
RPM_HASH = "a8e8bc6bc969c30a156b2f3702a96085f958a7e2efbe3f6c520253a70f7e7e90e5eab2b0a269bfd9e27dcb8813c4e288df79d5f0a81feb2d8892f680d2c743fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xss-sanitize-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
