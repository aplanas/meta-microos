SUMMARY = "Haskell microlens-th library development files"
DESCRIPTION = "This package provides the Haskell microlens-th library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.12"

RPM_NAME = "ghc-microlens-th-devel-0.4.3.12-1.2.aarch64.rpm"
RPM_HASH = "9d95bdbbba21e7604e30f84a7e8abee6e8bc8ef424f574250a6ff2d51a154c0db8049f4220852667cff80d8c2c95651920ac6a742c1fce52b9e49fefb0ad5a62"

RPROVIDES:${PN} += "ghc-devel-microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG \
ghc-microlens-th-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-devel-transformers-0.5.6.2 \
ghc-microlens-th"

inherit rpm
