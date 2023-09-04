SUMMARY = "Haskell void library development files"
DESCRIPTION = "This package provides the Haskell void library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "ghc-void-devel-0.7.3-6.3.aarch64.rpm"
RPM_HASH = "948608ce3aac257de497b1bb3a6088b373fe41ca057e35dfa074f02baa173427bcc31bf2de47b1b2e77dc2824baa3a9fed59888b823ec6576ad683395a27d4f9"

RPROVIDES:${PN} += "ghc-devel-void-0.7.3-GhXmDKlBHl0LbXoxVMxAU0 \
ghc-void-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-void"

inherit rpm
