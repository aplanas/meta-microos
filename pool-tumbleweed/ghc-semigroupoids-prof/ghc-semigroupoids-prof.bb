SUMMARY = "Haskell semigroupoids profiling library"
DESCRIPTION = "This package provides the Haskell semigroupoids profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.3.7"

RPM_NAME = "ghc-semigroupoids-prof-5.3.7-2.3.aarch64.rpm"
RPM_HASH = "15bd9682ed64ec1db125e2e62fb2d022289efa361d3650e3001dfee029e58cc828addb1d8a45df21a87948cae072d22dd0464f255308ab8ba029076effbec92f"

RPROVIDES:${PN} += "ghc-prof-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-semigroupoids-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-prof-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-prof-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-semigroupoids-devel"

inherit rpm
