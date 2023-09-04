SUMMARY = "Haskell network-info library development files"
DESCRIPTION = "This package provides the Haskell network-info library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-devel-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "0d46bffadb06406be9c8f7b120ec5567ecaadff574d504d22d9f3e3306059996a0bd21aa2fa49dab3c5961c59ded070ca28e7de3b1a2e94c7c2e410f90293c14"

RPROVIDES:${PN} += "ghc-devel-network-info-0.2.1-EA7QwxKMOIgJxpSbEh9J66 \
ghc-network-info-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-network-info"

inherit rpm
