SUMMARY = "Haskell parsec profiling library"
DESCRIPTION = "This package provides the Haskell parsec profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-prof-3.1.16.1-3.2.aarch64.rpm"
RPM_HASH = "93b278e2b33bd4d236c3a469af15a92f152270590e037f4ccdb3d41226fb8cf6a7d422285cf36dc0e8107becc0806cc236d6e51d27d5caaf5ee414b28acaf99e"

RPROVIDES:${PN} += "ghc-parsec-prof \
ghc-prof-parsec-3.1.16.1"

RDEPENDS:${PN} += "ghc-parsec-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
