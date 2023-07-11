SUMMARY = "Haskell lua library documentation"
DESCRIPTION = "This package provides the Haskell lua library documentation."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-doc-2.3.1-1.6.noarch.rpm"
RPM_HASH = "3a50c4b7cf50f16c42d02e85efa3550a974aad9962a058d30d7056a1f7885aba416016acd1501029449f99022259be529b465eabc67bbb884e117f1e36975b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lua-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
