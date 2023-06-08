SUMMARY = "Haskell tagged library documentation"
DESCRIPTION = "This package provides the Haskell tagged library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.7"

RPM_NAME = "ghc-tagged-doc-0.8.7-1.3.noarch.rpm"
RPM_HASH = "461206927cced049c37290e275a541993c035cad2a7eb925658f585239504f46d53f97815a6309bbf3d2c67ed4a29557f2a5aa93fb23690c139fc84a9e060b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tagged-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
