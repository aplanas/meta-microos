SUMMARY = "Haskell x509-store library documentation"
DESCRIPTION = "This package provides the Haskell x509-store library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-doc-1.6.9-2.6.noarch.rpm"
RPM_HASH = "81b3468198b2ece1011369262256dcd56e7b019dcc20a62d9c01cc118a5105db40b1d848f0f9ce1d857e033d8ec15469318074c5ff996ed250caa9fb63848c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-store-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
