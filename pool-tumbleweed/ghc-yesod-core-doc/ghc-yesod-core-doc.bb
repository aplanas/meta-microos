SUMMARY = "Haskell yesod-core library documentation"
DESCRIPTION = "This package provides the Haskell yesod-core library documentation."
LICENSE = "MIT"

PV = "1.6.24.2"

RPM_NAME = "ghc-yesod-core-doc-1.6.24.2-1.8.noarch.rpm"
RPM_HASH = "7dd94b2b1c977126198634cd6dd2e27b411e5679cacfef5858c64c1de6fe32935b4bba9926df40b4763bdbad23c77b5b8fdfe60864dd624ea3e64aa0d060bfa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
