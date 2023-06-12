SUMMARY = "Haskell tls library documentation"
DESCRIPTION = "This package provides the Haskell tls library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-doc-1.6.0-2.3.noarch.rpm"
RPM_HASH = "cb7174092a865707f30d1fd32b8bf338aa573e7e8b2e0150be1493bb112d7f3807b9d797ad8d8b8c124d85a4da97684cb99087c59acc95098ed9409e97740af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
