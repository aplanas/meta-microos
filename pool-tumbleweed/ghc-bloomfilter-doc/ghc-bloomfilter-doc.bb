SUMMARY = "Haskell bloomfilter library documentation"
DESCRIPTION = "This package provides the Haskell bloomfilter library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.0"

RPM_NAME = "ghc-bloomfilter-doc-2.0.1.0-6.6.noarch.rpm"
RPM_HASH = "83e565157b19c115f436758304ae8978bf14be8094f21429c7d907369bddb87d17462995181b877ef572b76d7b78e37c9f7bf2357774d34cf95be1c241422867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bloomfilter-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
