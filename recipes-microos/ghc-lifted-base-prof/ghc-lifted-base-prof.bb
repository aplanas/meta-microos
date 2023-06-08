SUMMARY = "Haskell lifted-base profiling library"
DESCRIPTION = "This package provides the Haskell lifted-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-prof-0.2.3.12-8.3.aarch64.rpm"
RPM_HASH = "b10a549bb3d436803141b574aaea777fd515096ed8e79bb0cadb4a5473d6ea060455b11b98762131d1bc7a0a2f5be1c9050d47662d667eb3e3264f1e03cb1b3a"

RPROVIDES:${PN} += "ghc-lifted-base-prof ghc-lifted-base-prof(aarch-64) ghc-prof(lifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo)"
RDEPENDS:${PN} += "ghc-lifted-base-devel ghc-prof(base-4.17.1.0) ghc-prof(monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX) ghc-prof(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp)"

inherit rpm
