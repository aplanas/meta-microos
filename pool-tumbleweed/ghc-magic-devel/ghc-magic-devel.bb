SUMMARY = "Haskell magic library development files"
DESCRIPTION = "This package provides the Haskell magic library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-devel-1.1-4.8.aarch64.rpm"
RPM_HASH = "7f353cbebc54c0b0bdab35807ec58c1c972c429b3cb8e211cc795dc6ef2467289c6c9bd2acdcf39c3e52f5eb88347e877d9efec5ace89e641b454368e0c5fbca"

RPROVIDES:${PN} += "ghc-devel-magic-1.1-I7L3tCx2kmTIw2Fco7m622 \
ghc-magic-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
file-devel \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-magic"

inherit rpm
