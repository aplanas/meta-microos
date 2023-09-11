SUMMARY = "Haskell citeproc library documentation"
DESCRIPTION = "This package provides the Haskell citeproc library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-doc-0.8.1-2.15.noarch.rpm"
RPM_HASH = "7cfef1220988e3ddc230976f23d0a79a37734e09899db5b33c99d923d4ce55d176e809cda1e89f11c39e1cbb5483b4e1262e4349cbede533fd33f7b399f54851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-citeproc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
