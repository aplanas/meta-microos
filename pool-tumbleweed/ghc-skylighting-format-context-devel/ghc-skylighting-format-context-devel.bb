SUMMARY = "Haskell skylighting-format-context library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-devel-0.1.0.2-1.6.aarch64.rpm"
RPM_HASH = "64929e757469fe7ac589801995542888b307259702772ec5fe68686c2018018239ba41219dbe306fca5aae86420e80a4a8a937eb29b9cf3bcdc7b7c66c90f6ed"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-context-0.1.0.2-I1BZIYXYOqlBramxRueIsx \
ghc-skylighting-format-context-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-context"

inherit rpm
