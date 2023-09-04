SUMMARY = "Haskell call-stack library documentation"
DESCRIPTION = "This package provides the Haskell call-stack library documentation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-doc-0.4.0-2.8.noarch.rpm"
RPM_HASH = "3ec2365cdfb31794fbe671dad92d64f91b47183a0bb87df5f3287b8352707c5457a285cc3b6f191a7416d438eae83138a43a75e22be67168b8fa4623589f78ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-call-stack-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
