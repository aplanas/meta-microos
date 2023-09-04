SUMMARY = "Haskell cprng-aes library documentation"
DESCRIPTION = "This package provides the Haskell cprng-aes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-doc-0.6.1-5.2.noarch.rpm"
RPM_HASH = "a5a1d51599d7949718582eefe38fa8ec523a55e8098d8fa487ee7d92ca20f75b095f1bfde038a77b70b85c6c08332e44012133ec8089baedb3ed2c0f863b30db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cprng-aes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
