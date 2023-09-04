SUMMARY = "Haskell tls-session-manager library documentation"
DESCRIPTION = "This package provides the Haskell tls-session-manager library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-doc-0.0.4-4.6.noarch.rpm"
RPM_HASH = "8b1dc1201d34eacc5f334c9d9aa7435029cb4401c3f835d17113f3b901df20b66c7a3e219cc2ce953cde56cd6b0b66e2d076f1ab041d8a4b0ea5779052df03aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-session-manager-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
