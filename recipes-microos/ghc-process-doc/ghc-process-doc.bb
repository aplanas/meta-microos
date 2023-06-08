SUMMARY = "Haskell process library documentation"
DESCRIPTION = "This package provides the Haskell process library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-doc-1.6.16.0-1.1.noarch.rpm"
RPM_HASH = "edad946fddcde88dc14532e54a57f44161102345d1dfe7c74a608fa67704f25715e0d9b97a4f99e03ee49f5b1a5025972a865f2853a1f9204dbcdcbb7a40ae8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-process-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
