SUMMARY = "Haskell entropy library documentation"
DESCRIPTION = "This package provides the Haskell entropy library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-doc-0.4.1.10-3.2.noarch.rpm"
RPM_HASH = "d677f8b1361ef010f978040b1ee713f64d494b223ac9abc1f471d01b8d670181ef22d40483e8ddf05ef0b05edcf641e77bf2d6a61194e270835164b1a32b0bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-entropy-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
