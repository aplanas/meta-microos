SUMMARY = "Haskell hslua-objectorientation library documentation"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-doc-2.3.0-1.2.noarch.rpm"
RPM_HASH = "14eb498617ebfd408395d12add91837233f458b79b96538cf6ad8c42b67a184ad827cd3ff660e403e1b826a54c3a3ef2d4895c70b82170d242775538672d1b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-objectorientation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
