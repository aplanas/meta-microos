SUMMARY = "Haskell StateVar library development files"
DESCRIPTION = "This package provides the Haskell StateVar library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-devel-1.2.2-2.2.aarch64.rpm"
RPM_HASH = "552ba978ca5bb596f1261854e624e83b272d8aed39dbf95a74cceef3c91b5ac790c5a45a798b5c3d5d0a317255b66769bbc6ffd72fc2020ac5ee5432e501a855"

RPROVIDES:${PN} += "ghc-StateVar-devel \
ghc-StateVar-devel(aarch-64) \
ghc-devel(StateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN)"
RDEPENDS:${PN} += "/bin/sh \
ghc-StateVar \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(stm-2.5.1.0) \
ghc-devel(transformers-0.5.6.2)"

inherit rpm
