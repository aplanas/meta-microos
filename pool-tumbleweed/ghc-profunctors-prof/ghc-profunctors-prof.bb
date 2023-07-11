SUMMARY = "Haskell profunctors profiling library"
DESCRIPTION = "This package provides the Haskell profunctors profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-prof-5.6.2-4.6.aarch64.rpm"
RPM_HASH = "7dc611aa804e632c1e96a3a6e9153e05d2ae05b5cd2e603bdb210225016eee8aaa3189df3e149235b72c8be8755c35b281f689000b0cd72374f62be00f9de80e"

RPROVIDES:${PN} += "ghc-prof-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-profunctors-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-prof-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-prof-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-transformers-0.5.6.2 \
ghc-profunctors-devel"

inherit rpm
