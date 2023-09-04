SUMMARY = "Haskell bloomfilter library documentation"
DESCRIPTION = "This package provides the Haskell bloomfilter library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.2"

RPM_NAME = "ghc-bloomfilter-doc-2.0.1.2-1.2.noarch.rpm"
RPM_HASH = "4d734797a4953997a2e1b47f54bacf0d62cbfc736f7121e26d841e734bb648fe1d8a45e5da483367160c73343d69d210790d646aa7a679af54436780f7d4cdad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bloomfilter-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
