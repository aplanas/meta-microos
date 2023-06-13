SUMMARY = "Haskell cmdargs library development files"
DESCRIPTION = "This package provides the Haskell cmdargs library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-devel-0.10.22-1.3.aarch64.rpm"
RPM_HASH = "55b9e2f395458376b4a7d3eb88f23c47638dd24ba032b5664150f432b26af84ee214dd6e618b45ddf8dd9c1aa7084fe94b3f39cd600107142dabc6218da3a05f"

RPROVIDES:${PN} += "ghc-cmdargs-devel \
ghc-cmdargs-devel(aarch-64) \
ghc-devel(cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx)"

RDEPENDS:${PN} += "/bin/sh \
ghc-cmdargs \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(process-1.6.16.0) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(transformers-0.5.6.2)"

inherit rpm
