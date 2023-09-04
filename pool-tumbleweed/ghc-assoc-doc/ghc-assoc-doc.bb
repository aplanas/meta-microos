SUMMARY = "Haskell assoc library documentation"
DESCRIPTION = "This package provides the Haskell assoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-assoc-doc-1.1-1.6.noarch.rpm"
RPM_HASH = "23927f31a2ec638dd96afa1bc0e328cf8d59784082a35e0a0b7d674aa4a57e17d75ed991cb17a53d05cf62b32d90bb080342a33d0411b09608681486888938d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-assoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
