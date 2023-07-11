SUMMARY = "Haskell http2 library documentation"
DESCRIPTION = "This package provides the Haskell http2 library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-doc-3.0.3-2.7.noarch.rpm"
RPM_HASH = "7fed2f689e9429f6e615ed51b9c108f44b248820796620949e958c079a8fd68d839a19d8cd3f7b31b1a6cccef1a2646b5464998a63e58561b2690e5fe37a506b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http2-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
