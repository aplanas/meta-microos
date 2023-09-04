SUMMARY = "Haskell uglymemo profiling library"
DESCRIPTION = "This package provides the Haskell uglymemo profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-prof-0.1.0.1-4.3.aarch64.rpm"
RPM_HASH = "0369f0a5b1f25b105441d2cc57580239766902e3b887921e2607a9a37565e3a220fd82e8533252d81840d9e2fcfa0471137618fbf3bb0f57b89620899a1f1515"

RPROVIDES:${PN} += "ghc-prof-uglymemo-0.1.0.1-FaxrSjBe3XhIHSfEZHhJ9C \
ghc-uglymemo-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-uglymemo-devel"

inherit rpm
