SUMMARY = "Haskell language-c profiling library"
DESCRIPTION = "This package provides the Haskell language-c profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-prof-0.9.2-2.3.aarch64.rpm"
RPM_HASH = "1e7ddf097b9a18b9c15ceff0f3f0f0fd8534fb3e90c8b4514284e77e9a569f521dfea0d568e62556e690dbf4bfd00d31195f90a4f134e26224b43a395c32e7de"

RPROVIDES:${PN} += "ghc-language-c-prof \
ghc-prof-language-c-0.9.2-5l7vUWhvlwnEvBOKlkChTz"

RDEPENDS:${PN} += "ghc-language-c-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.16.0"

inherit rpm
