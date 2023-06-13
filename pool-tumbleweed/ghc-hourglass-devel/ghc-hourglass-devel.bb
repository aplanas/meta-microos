SUMMARY = "Haskell hourglass library development files"
DESCRIPTION = "This package provides the Haskell hourglass library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-devel-0.2.12-7.3.aarch64.rpm"
RPM_HASH = "971393cc398546ca8524dbb617c126824b2083aa24f3262369089214783044e281bb7e1d92c25bb8eff496a53cb45a7a0eb1e0ef254c3bbaa5270e1c952314e1"

RPROVIDES:${PN} += "ghc-devel(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3) \
ghc-hourglass-devel \
ghc-hourglass-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-hourglass"

inherit rpm
