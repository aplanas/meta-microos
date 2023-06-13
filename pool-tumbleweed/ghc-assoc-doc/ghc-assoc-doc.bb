SUMMARY = "Haskell assoc library documentation"
DESCRIPTION = "This package provides the Haskell assoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-assoc-doc-1.0.2-7.3.noarch.rpm"
RPM_HASH = "aedb665d7d21273dcd4740326fc9bc553a659430dd573b2eebd69467f1ebbff26d6fd64a5c5cfad8ceceaf95c1b3a99ffdd5188272e2f57e963de4281405f340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-assoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
