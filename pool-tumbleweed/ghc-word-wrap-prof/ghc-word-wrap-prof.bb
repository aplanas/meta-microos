SUMMARY = "Haskell word-wrap profiling library"
DESCRIPTION = "This package provides the Haskell word-wrap profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-prof-0.5-2.3.aarch64.rpm"
RPM_HASH = "c2da36fc2775b191e988a5415e9a5bbc489ad82a58279e72630fb55bb135de453111b55a05fac76311d761438baf469f0fb3288b4be870ab34e1d31f4ed795a5"

RPROVIDES:${PN} += "ghc-prof-word-wrap-0.5-6mKx5HwYguB2E3kl2rrPmY \
ghc-word-wrap-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-text-2.0.2 \
ghc-word-wrap-devel"

inherit rpm
