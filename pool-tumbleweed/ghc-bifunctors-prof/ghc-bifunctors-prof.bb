SUMMARY = "Haskell bifunctors profiling library"
DESCRIPTION = "This package provides the Haskell bifunctors profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-prof-5.5.15-1.3.aarch64.rpm"
RPM_HASH = "bd41c5d9d7f9d69c231b027683ebe9e7727507abe0ab9556ea14bcf9388b3d7025cacf98e9220167b35963fd6db02f8016370b281054336683870f9499023891"

RPROVIDES:${PN} += "ghc-bifunctors-prof \
ghc-bifunctors-prof(aarch-64) \
ghc-prof(bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL)"

RDEPENDS:${PN} += "ghc-bifunctors-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) \
ghc-prof(comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4) \
ghc-prof(containers-0.6.7) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
