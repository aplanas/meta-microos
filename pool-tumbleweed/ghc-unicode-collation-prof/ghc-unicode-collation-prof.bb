SUMMARY = "Haskell unicode-collation profiling library"
DESCRIPTION = "This package provides the Haskell unicode-collation profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-prof-0.1.3.4-1.9.aarch64.rpm"
RPM_HASH = "b4b8b1f5ae010a73fcf995836375724c4895f696b4b4bcd606cd20141463efd43ebf9ec7984246870f9a056f77638f64eacbf2f2b77a954855226d00cb09d22e"

RPROVIDES:${PN} += "ghc-prof-unicode-collation-0.1.3.4-DqHFcwJyC4MIpiT6hQTOCQ \
ghc-unicode-collation-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3 \
ghc-unicode-collation-devel"

inherit rpm
