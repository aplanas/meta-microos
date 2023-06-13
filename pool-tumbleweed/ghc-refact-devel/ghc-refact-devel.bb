SUMMARY = "Haskell refact library development files"
DESCRIPTION = "This package provides the Haskell refact library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-devel-0.3.0.2-4.2.aarch64.rpm"
RPM_HASH = "be6df61897df171c1a35c2574d06651599582769cdc9e643588169dfee858039e9796c62175ff56f9be944e3a860388122c88cbbe9769445cfafa0f763154f34"

RPROVIDES:${PN} += "ghc-devel(refact-0.3.0.2-4ZnrxSKFCNFLIgjtpZGW26) \
ghc-refact-devel \
ghc-refact-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-refact"

inherit rpm
