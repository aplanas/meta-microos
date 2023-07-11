SUMMARY = "Haskell microlens-th profiling library"
DESCRIPTION = "This package provides the Haskell microlens-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.13"

RPM_NAME = "ghc-microlens-th-prof-0.4.3.13-1.1.aarch64.rpm"
RPM_HASH = "2fc83d6e9cd22b81ec7142c1abf3638ef1a549790c53ad6879bf6514321ef66310383a9d80b1610a6dde12d999446f2a938745cb636383a4917d044a979fdd8a"

RPROVIDES:${PN} += "ghc-microlens-th-prof \
ghc-prof-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C"

RDEPENDS:${PN} += "ghc-microlens-th-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-prof-transformers-0.5.6.2"

inherit rpm
