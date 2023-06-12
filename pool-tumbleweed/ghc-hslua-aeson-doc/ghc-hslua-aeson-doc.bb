SUMMARY = "Haskell hslua-aeson library documentation"
DESCRIPTION = "This package provides the Haskell hslua-aeson library documentation."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-doc-2.3.0.1-1.2.noarch.rpm"
RPM_HASH = "b3af263c4af081985aff4d1d8c8db20a9527a5f5d1de37027ef64653e60fa7676fd2596cb28da204910480add6f2b4b4440116c412c45729acbfecb9aca0d737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-aeson-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
