SUMMARY = "Haskell ilist library documentation"
DESCRIPTION = "This package provides the Haskell ilist library documentation."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-ilist-doc-0.4.0.1-1.2.noarch.rpm"
RPM_HASH = "922d0c42962e45965894edf3de7a097276a5118439536c307da489d368fd77b85b0a50224001418d08956522d5a3cc4a2136d11adcc2f5ba20fb45af170d2a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ilist-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
