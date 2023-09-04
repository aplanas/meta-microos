SUMMARY = "Haskell StateVar library development files"
DESCRIPTION = "This package provides the Haskell StateVar library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-devel-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "942ac30f5e667917a60c3abe054615df6980a98e87292b9334724da60844bc89b4e32860d922f023934b791c7698db430c379187b609d558af112599ca1289dd"

RPROVIDES:${PN} += "ghc-StateVar-devel \
ghc-devel-StateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-StateVar \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
