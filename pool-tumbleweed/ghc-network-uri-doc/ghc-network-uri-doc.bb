SUMMARY = "Haskell network-uri library documentation"
DESCRIPTION = "This package provides the Haskell network-uri library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-doc-2.6.4.2-2.8.noarch.rpm"
RPM_HASH = "88845d551186ee34bf5ced69fca454482609a90c351ba2bd8e3d3594e0bed0f1fd749772cd0291c2b1f39c34f162e894c49835489238dd784855a7b513ac297b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-uri-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
