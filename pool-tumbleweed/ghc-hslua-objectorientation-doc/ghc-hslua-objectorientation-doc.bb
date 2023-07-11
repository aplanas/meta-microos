SUMMARY = "Haskell hslua-objectorientation library documentation"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-doc-2.3.0-1.3.noarch.rpm"
RPM_HASH = "24ff6740631ae4c635aae14317b2b42a55e9abf8edcddee37b4a21c0466ae1493b80771a36751ebe0335cb21812807099ffe192be3f5430a62a3c95e10a0348a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-objectorientation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
