SUMMARY = "Haskell profunctors profiling library"
DESCRIPTION = "This package provides the Haskell profunctors profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-prof-5.6.2-4.3.aarch64.rpm"
RPM_HASH = "96ed0d2774ac08a71dd98f400c055f0cdb1b8265bd5c07e850aaf196c53d99b62a492675afcdd4b36cfd2431e5c22f45ba4538760410e93d3492af0b465e4a71"

RPROVIDES:${PN} += "ghc-prof(profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV) \
ghc-profunctors-prof \
ghc-profunctors-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) \
ghc-prof(bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL) \
ghc-prof(comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4) \
ghc-prof(contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao) \
ghc-prof(distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-prof(transformers-0.5.6.2) \
ghc-profunctors-devel"

inherit rpm
