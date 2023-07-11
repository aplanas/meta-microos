SUMMARY = "Haskell call-stack library documentation"
DESCRIPTION = "This package provides the Haskell call-stack library documentation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-doc-0.4.0-2.6.noarch.rpm"
RPM_HASH = "297b1baf07558da22e411e0922f988c594398cc19abc062f7daea4864a1e77c09ec3ab379db3214e04c4299e76cefb7e13d51bf06491edd11a61291c6fb62343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-call-stack-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
