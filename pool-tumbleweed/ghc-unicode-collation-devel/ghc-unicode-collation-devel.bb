SUMMARY = "Haskell unicode-collation library development files"
DESCRIPTION = "This package provides the Haskell unicode-collation library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-devel-0.1.3.4-1.3.aarch64.rpm"
RPM_HASH = "34e1e0c526383a085b1d748bb7aa761dd5c92e3a2a092f6a1d37fe49e0aad531b44875cffa092b7cae271993db86a54e10c3fc36349e452ef07444f0361d56b7"

RPROVIDES:${PN} += "ghc-devel-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-unicode-collation-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx \
ghc-unicode-collation"

inherit rpm
