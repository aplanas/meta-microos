SUMMARY = "Haskell time-compat library development files"
DESCRIPTION = "This package provides the Haskell time-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-devel-1.9.6.1-5.9.aarch64.rpm"
RPM_HASH = "7eb045aade031bfc4052e325ff9c6532486da297ece8f4c739e7f1831da5e278df2b67f740c7a1b43bc012faaa18cec54b9673e88a46ada27f6271af9e72f60f"

RPROVIDES:${PN} += "ghc-devel-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM \
ghc-time-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-time-1.12.2 \
ghc-time-compat"

inherit rpm
