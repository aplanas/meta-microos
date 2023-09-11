SUMMARY = "Haskell http-media library documentation"
DESCRIPTION = "This package provides the Haskell http-media library documentation."
LICENSE = "MIT"

PV = "0.8.1.0"

RPM_NAME = "ghc-http-media-doc-0.8.1.0-1.1.noarch.rpm"
RPM_HASH = "a36d591976231f86ae260c62bd6a0d80ab802fff867388a0c5f9bacc96a3ea460c6bc6092f7413598670f935a18945709be41485f71806c136014ffb08e32b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-media-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
