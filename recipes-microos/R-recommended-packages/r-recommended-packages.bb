SUMMARY = "Metapackage, requires all recommended Packages"
DESCRIPTION = "Metapackage, Requires: all recommended Packages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-recommended-packages-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "61359b70edcdda297baa99eb28eba9a76c0eddc65fb78bb168434b2d7f2eabfe557ec592d4bc0a1a13a5ab5faaad64e5fb4d996d200f4bf3667b226d9d04ca2a"

RPROVIDES:${PN} += "R-recommended-packages R-recommended-packages(aarch-64)"
RDEPENDS:${PN} += "R-KernSmooth R-MASS R-Matrix R-base R-boot R-class R-cluster R-codetools R-foreign R-lattice R-mgcv R-nlme R-nnet R-rpart R-spatial R-survival"

inherit rpm
