SUMMARY = "Haskell http-api-data library documentation"
DESCRIPTION = "This package provides the Haskell http-api-data library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-doc-0.5-4.1.noarch.rpm"
RPM_HASH = "1b6efb43e6d15ca21964c399ffa767901be3614fcd96c5bf281c828dfc9dcb6838596f0a94821db8303a238d62c351edb32ee7f63772e0f754397802c1fbfab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-api-data-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
