SUMMARY = "Haskell extra library development files"
DESCRIPTION = "This package provides the Haskell extra library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-devel-1.7.14-1.2.aarch64.rpm"
RPM_HASH = "b2e6c6f5f0b3d5fbb990faa5b60394cd60e6b8e7781cb31c53fb4afc6c28955a1ecd2328c5ad44137a1dac2218e9fcf761e6cbe198d0098f8f384d38ad0baf27"

RPROVIDES:${PN} += "ghc-devel-extra-1.7.14-9MsHIUa0FAo4DKg07m0mTc \
ghc-extra-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-clock-0.8.4-Kk7SFw4SNhZ8ktwfjRIPil \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-extra"

inherit rpm
