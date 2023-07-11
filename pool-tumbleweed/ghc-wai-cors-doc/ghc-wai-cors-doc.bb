SUMMARY = "Haskell wai-cors library documentation"
DESCRIPTION = "This package provides the Haskell wai-cors library documentation."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-doc-0.2.7-1.3.noarch.rpm"
RPM_HASH = "150bb68975e539b1487ca158dc8d425e93fdf0ccac7f4c2acbe916e0307600aca50f96dec8d748ca332d97ede8c1e8ef68bb9300e37c9e62b827d9d62b82df03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-cors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
