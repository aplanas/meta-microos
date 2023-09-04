SUMMARY = "Haskell unicode-collation library development files"
DESCRIPTION = "This package provides the Haskell unicode-collation library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-devel-0.1.3.4-1.9.aarch64.rpm"
RPM_HASH = "5b799dd7b31ebfcee58d3b6ea9bcd320c35c8efdd86461f86e407fd1e33046e9b03672e7da139c7461f62bebf12c481eae499870f23412134c26788d2099a556"

RPROVIDES:${PN} += "ghc-devel-unicode-collation-0.1.3.4-DqHFcwJyC4MIpiT6hQTOCQ \
ghc-unicode-collation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3 \
ghc-unicode-collation"

inherit rpm
