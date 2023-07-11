SUMMARY = "Haskell regex-base library documentation"
DESCRIPTION = "This package provides the Haskell regex-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-doc-0.94.0.2-3.6.noarch.rpm"
RPM_HASH = "77f724200e3bfba8bf54f9688f8e04039e6ec91750b5c9b793e1167f01f1993dff24dc5f092f51cc564df70193ae93df753ae9f066aeff532dd8feb699cf278b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
