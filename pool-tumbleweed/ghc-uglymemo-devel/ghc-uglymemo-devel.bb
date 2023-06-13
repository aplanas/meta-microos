SUMMARY = "Haskell uglymemo library development files"
DESCRIPTION = "This package provides the Haskell uglymemo library development files."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-devel-0.1.0.1-4.2.aarch64.rpm"
RPM_HASH = "741fbba1c4c00d0200f3a64e6e0f7ff3b88e4919ab3ef0b0be791e366b2b3abb94add82a71d632d0af159f4881303d519029a356808c15264281649cdbbb1f27"

RPROVIDES:${PN} += "ghc-devel(uglymemo-0.1.0.1-Balkr8KlO4bDeailuusufT) \
ghc-uglymemo-devel \
ghc-uglymemo-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-uglymemo"

inherit rpm
