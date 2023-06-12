SUMMARY = "Haskell http-api-data library documentation"
DESCRIPTION = "This package provides the Haskell http-api-data library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-doc-0.5-3.2.noarch.rpm"
RPM_HASH = "573a756ccaaa9375e0731d7fb9d5a58c7af249b5c85706a358a9873276e537981da068d2ec7781aefcade62e345e46e68bc85577e1daf154f9e6cd9d4fa94229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-api-data-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
