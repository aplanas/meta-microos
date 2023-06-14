SUMMARY = "Haskell xhtml library development files"
DESCRIPTION = "This package provides the Haskell xhtml library development files."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-devel-3000.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "ce5b7d2138343aa0ac39ef20cc8c31b212f923959db49cf910f692075156dcd744f50cbc3236b3766fec3b2e6e74f085840e355260f8f31e87a27f2edb556002"

RPROVIDES:${PN} += "ghc-devel-xhtml-3000.2.2.1 \
ghc-xhtml-devel \
ghc-xhtml-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-xhtml"

inherit rpm
