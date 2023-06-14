SUMMARY = "Haskell StateVar profiling library"
DESCRIPTION = "This package provides the Haskell StateVar profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-prof-1.2.2-2.2.aarch64.rpm"
RPM_HASH = "a07afa8b0407e46e878e4313d77c06a6dc9a8d1731a33e5515d9ae05c165f42751d68576100cd08c2ae4e3a1c8f659265f93f8c4504202fb45e0a6a8d3c6ebc4"

RPROVIDES:${PN} += "ghc-StateVar-prof \
ghc-prof-StateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN"

RDEPENDS:${PN} += "ghc-StateVar-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
