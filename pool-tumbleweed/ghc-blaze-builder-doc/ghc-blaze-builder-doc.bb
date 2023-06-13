SUMMARY = "Haskell blaze-builder library documentation"
DESCRIPTION = "This package provides the Haskell blaze-builder library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-doc-0.4.2.2-3.3.noarch.rpm"
RPM_HASH = "3234a0f0daca06809af79b9ca6ba9d64725a3686ec6706c408d49ca93464eb110faddb08fd6ac8e5c9ee27bd9280ddfb74e235a4fa42cb4bbdfbec9a2908c47d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-builder-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
