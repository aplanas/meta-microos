SUMMARY = "Haskell wai-cors library documentation"
DESCRIPTION = "This package provides the Haskell wai-cors library documentation."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-doc-0.2.7-1.2.noarch.rpm"
RPM_HASH = "0b207e45e71558b5a44304a013641f445e36675ef9e69d116f57d631192f3a42248aab7d5e322cd804e95ac3c9955869c741dcfc98772aabaa43b9c70c01e6fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-cors-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
