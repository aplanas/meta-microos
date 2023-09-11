SUMMARY = "Haskell unicode-collation library development files"
DESCRIPTION = "This package provides the Haskell unicode-collation library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.5"

RPM_NAME = "ghc-unicode-collation-devel-0.1.3.5-1.1.aarch64.rpm"
RPM_HASH = "65903639381058a7da79faa745a41920e212ddfbfaac58b7ae4ef4879eb6b417186effffde9a56a33ef0d1a3b924056ba324a9ce1dbbdd6b079a2ecab8286d9c"

RPROVIDES:${PN} += "ghc-devel-unicode-collation-0.1.3.5-IFdGKnlU7nK53rXIDeXQnQ \
ghc-unicode-collation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3 \
ghc-unicode-collation"

inherit rpm
