SUMMARY = "Haskell th-abstraction profiling library"
DESCRIPTION = "This package provides the Haskell th-abstraction profiling library."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-prof-0.4.5.0-2.6.aarch64.rpm"
RPM_HASH = "26dda8006d739ea6fe983bebb2ed365bbd65f377d123f8d6819bd0a720d9e03591ebb77f291bb721ccc0725c5e94b7de9ca342c9a4fd66398bc0057a25bfb685"

RPROVIDES:${PN} += "ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-th-abstraction-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-th-abstraction-devel"

inherit rpm
