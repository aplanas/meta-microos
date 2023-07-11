SUMMARY = "Haskell unicode-collation library development files"
DESCRIPTION = "This package provides the Haskell unicode-collation library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-devel-0.1.3.4-1.6.aarch64.rpm"
RPM_HASH = "3be05efb7ec01d8c012a6e60cc115a3e14f12f94e390e0b1251ea5cdd2207b78d0154afd0b1ba57fca14efafcfbfb06aef8ffdd9eb935cd3709d676c5a71fa13"

RPROVIDES:${PN} += "ghc-devel-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-unicode-collation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
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
