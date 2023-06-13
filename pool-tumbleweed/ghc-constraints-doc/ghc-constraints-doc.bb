SUMMARY = "Haskell constraints library documentation"
DESCRIPTION = "This package provides the Haskell constraints library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-doc-0.13.4-2.3.noarch.rpm"
RPM_HASH = "b3515ec842f40a8a48311892e30eee3ee0362ec2fd4661abcbd051b764d8936c41239622a66073747985fc0dc3fc357e56b28e96f58a933dde52ffb80572d677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-constraints-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
