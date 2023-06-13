SUMMARY = "Haskell easy-file library documentation"
DESCRIPTION = "This package provides the Haskell easy-file library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-easy-file-doc-0.2.3-1.3.noarch.rpm"
RPM_HASH = "b3c761ebbf82ad7d6e9c62ecf9e7090cb0096b556af23be4a24f2f62e44a1bb651229965babce4631caa902fc3c8a8f18778527936bfed3a4055bea5c58165c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-easy-file-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
