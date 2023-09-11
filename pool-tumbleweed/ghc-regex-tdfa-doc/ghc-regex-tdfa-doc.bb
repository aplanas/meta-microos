SUMMARY = "Haskell regex-tdfa library documentation"
DESCRIPTION = "This package provides the Haskell regex-tdfa library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.2"

RPM_NAME = "ghc-regex-tdfa-doc-1.3.2.2-2.1.noarch.rpm"
RPM_HASH = "dec77a9f36facb12375abae06e0a293d0113daa2a6b81bd74eeca7ce1223259fc4964d07de908b56dc1b71fb80cc7c86102a79baf95f6ed61d898bbc55caa898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-tdfa-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
