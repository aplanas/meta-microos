SUMMARY = "Haskell word8 library documentation"
DESCRIPTION = "This package provides the Haskell word8 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-doc-0.1.3-5.8.noarch.rpm"
RPM_HASH = "f98572948f7dd6a69c928a0d75ccb6a0bb0566803111ed9baf6f312b2a04136de3796bcdf31db379de9835405351d32331e41d2ac5b4430242b7eb797972d92a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-word8-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
