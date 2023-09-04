SUMMARY = "Haskell byteorder library development files"
DESCRIPTION = "This package provides the Haskell byteorder library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-devel-1.0.4-4.3.aarch64.rpm"
RPM_HASH = "b08a289fbbbe1938a9add58fbd78eb1a2179b03e7f8aa7239e3b250af29fba5b981bbafbef5b554ff5f42fe09f48d32f09164e40d5949f134095fbc9362c9371"

RPROVIDES:${PN} += "ghc-byteorder-devel \
ghc-devel-byteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-byteorder \
ghc-compiler \
ghc-devel-base-4.17.2.0"

inherit rpm
