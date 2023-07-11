SUMMARY = "Haskell bifunctors profiling library"
DESCRIPTION = "This package provides the Haskell bifunctors profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-prof-5.5.15-1.6.aarch64.rpm"
RPM_HASH = "ad72a35a49f878070ce6387c9aeda279e9c76cde92467df553155d1096d18de11a72998877fa4a1e2edd52eb59c0c2c031d3e4325a207ce05c74295196ef9717"

RPROVIDES:${PN} += "ghc-bifunctors-prof \
ghc-prof-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL"

RDEPENDS:${PN} += "ghc-bifunctors-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-containers-0.6.7 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-prof-transformers-0.5.6.2"

inherit rpm
