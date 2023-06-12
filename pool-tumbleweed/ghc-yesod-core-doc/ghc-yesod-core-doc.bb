SUMMARY = "Haskell yesod-core library documentation"
DESCRIPTION = "This package provides the Haskell yesod-core library documentation."
LICENSE = "MIT"

PV = "1.6.24.2"

RPM_NAME = "ghc-yesod-core-doc-1.6.24.2-1.4.noarch.rpm"
RPM_HASH = "6e77066c53d960902c48dfa0f99a2c15e6adb8f129119161e59133f58857ecdf6db1405b39d7265bacd0dafa16375bc247e3bc242f22c275bfeb7d87d42f4914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-core-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
