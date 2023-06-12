SUMMARY = "Haskell isocline library development files"
DESCRIPTION = "This package provides the Haskell isocline library development files."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-devel-1.0.9-1.3.aarch64.rpm"
RPM_HASH = "dd3a0139ac39d105d650aee2d33b11e22e8bc4b40b7369d07d3e03f514192a345528477860faefc493e0db59bd6e9e42e3842ef50e2fc75f7713138347a3b737"

RPROVIDES:${PN} += "ghc-devel(isocline-1.0.9-7x8dFWbXh69GJxYhigSqXG) \
ghc-isocline-devel \
ghc-isocline-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(text-2.0.2) \
ghc-isocline"

inherit rpm
