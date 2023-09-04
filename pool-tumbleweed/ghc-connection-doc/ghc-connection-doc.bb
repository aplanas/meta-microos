SUMMARY = "Haskell connection library documentation"
DESCRIPTION = "This package provides the Haskell connection library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-doc-0.3.1-8.3.noarch.rpm"
RPM_HASH = "7b2f21a88180830c46b14b98ec2645f1d353369576de6bfb5100130df0997b75cdefd46b61a2f95dede29d275842c30da6a59c9db0a8e5aa50fc360131fb88d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-connection-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
