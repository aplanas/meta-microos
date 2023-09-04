SUMMARY = "Haskell generically library development files"
DESCRIPTION = "This package provides the Haskell generically library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-devel-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "8bf10a6d776d910ee4bbaff29de2a326b2341cc16c2e279c66715a6a185dae5c36c473fc24c0a6e06c69b53010e895802cc3674ce68c77f6b9570c476881dfef"

RPROVIDES:${PN} += "ghc-devel-generically-0.1.1-CmULdC2547fBrHCkT48ujn \
ghc-generically-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-generically"

inherit rpm
