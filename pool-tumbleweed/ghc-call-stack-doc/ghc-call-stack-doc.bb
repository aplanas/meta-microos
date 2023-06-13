SUMMARY = "Haskell call-stack library documentation"
DESCRIPTION = "This package provides the Haskell call-stack library documentation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-doc-0.4.0-2.3.noarch.rpm"
RPM_HASH = "2d60168d6a33991f4dda9b2731cea6583d85e58dc8db68b7ec6df17a65c6dc7c747bd64b6137269dd6ece887f40875fa1bcaf98c454138309fbf9d56e74cc0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-call-stack-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
