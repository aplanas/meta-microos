SUMMARY = "Haskell haskell-lexer library documentation"
DESCRIPTION = "This package provides the Haskell haskell-lexer library documentation."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-doc-1.1.1-2.3.noarch.rpm"
RPM_HASH = "9010457af011863bb1043991788d42c7effc31234008b904f949cc1674c0be6ddd3d8b34eccd5e6ae72dc89283c7f866bc4adb60c23e66847e8d29fbc5204765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskell-lexer-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
