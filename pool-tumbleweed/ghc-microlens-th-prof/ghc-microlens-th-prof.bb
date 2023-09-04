SUMMARY = "Haskell microlens-th profiling library"
DESCRIPTION = "This package provides the Haskell microlens-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.13"

RPM_NAME = "ghc-microlens-th-prof-0.4.3.13-1.2.aarch64.rpm"
RPM_HASH = "2d41cef9bade91366824afcb49fda56d14724bd25fd3e07d3a7a880ffacb570ff69419c38ca36434b7eb370f3982a8d6511289b176ed538d7c0e3b581234600c"

RPROVIDES:${PN} += "ghc-microlens-th-prof \
ghc-prof-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF"

RDEPENDS:${PN} += "ghc-microlens-th-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-prof-transformers-0.5.6.2"

inherit rpm
