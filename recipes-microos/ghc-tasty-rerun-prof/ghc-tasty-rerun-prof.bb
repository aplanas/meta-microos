SUMMARY = "Haskell tasty-rerun profiling library"
DESCRIPTION = "This package provides the Haskell tasty-rerun profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-prof-1.1.18-6.2.aarch64.rpm"
RPM_HASH = "5b774cca6b888ba281b8902382b7d35057a6d5068eacfc6902f7cc00aea2a74ed2c216959d0ab6b687dba92bfe0a3007abe1b7e11d582a85116d449a629cb13f"

RPROVIDES:${PN} += "ghc-prof(tasty-rerun-1.1.18-901DN5WLpsB5zohVN159Pf) ghc-tasty-rerun-prof ghc-tasty-rerun-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(mtl-2.2.2) ghc-prof(optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB) ghc-prof(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) ghc-prof(stm-2.5.1.0) ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) ghc-prof(tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz) ghc-prof(transformers-0.5.6.2) ghc-tasty-rerun-devel"

inherit rpm
