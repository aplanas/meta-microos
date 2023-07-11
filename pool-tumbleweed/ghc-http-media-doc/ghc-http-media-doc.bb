SUMMARY = "Haskell http-media library documentation"
DESCRIPTION = "This package provides the Haskell http-media library documentation."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-doc-0.8.0.0-6.6.noarch.rpm"
RPM_HASH = "edb54c01c920d9f59a050ce8c690e7c260c623b06ec20d9fd8e6d602f519f04f8daab78366785c7fcf830cdf952244830e21180cdacda20aa94e5f67fdc29c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-media-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
