SUMMARY = "Haskell http-media library documentation"
DESCRIPTION = "This package provides the Haskell http-media library documentation."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-doc-0.8.0.0-6.3.noarch.rpm"
RPM_HASH = "f3c3c958c4d4da3f37bd932aee56972ea8cae5ce5070ef70916e2185444a9fab448be046d07159b4394b246be52ad882a25e353e6ccbf28b63767ad1c40cc619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-media-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
