SUMMARY = "Haskell language-javascript library documentation"
DESCRIPTION = "This package provides the Haskell language-javascript library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-doc-0.7.1.0-4.6.noarch.rpm"
RPM_HASH = "1d78c325e38a9d4e4fffe127fd390d7a9b39db0b73a9132cfa3a19dd1b39516b896d89f6aea52965192e3a87a800590a0384b712876119d4c8aeed37e4550ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-javascript-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
