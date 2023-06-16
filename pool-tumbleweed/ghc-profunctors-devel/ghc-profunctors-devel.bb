SUMMARY = "Haskell profunctors library development files"
DESCRIPTION = "This package provides the Haskell profunctors library development files."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-devel-5.6.2-4.3.aarch64.rpm"
RPM_HASH = "04638db24cd377555e0d4de30784e991cd4e65f42eb86671d9840524828a7bd223b47702193df3a2a77e1cff54f005e09fc5732509e7c20bad16eb7cf5669afb"

RPROVIDES:${PN} += "ghc-devel-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-profunctors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-devel-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-devel-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-devel-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-transformers-0.5.6.2 \
ghc-profunctors"

inherit rpm
