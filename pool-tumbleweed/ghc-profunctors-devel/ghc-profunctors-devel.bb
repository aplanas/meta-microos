SUMMARY = "Haskell profunctors library development files"
DESCRIPTION = "This package provides the Haskell profunctors library development files."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-devel-5.6.2-4.6.aarch64.rpm"
RPM_HASH = "a2b1968db66e5355cb8ef227bf2ffb41e4bfe5d3848778cfb4a46461b1c684c7070cd845b589a5bfb6eadfba074589d354c95ffa00ce167f621cfe3325612887"

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
