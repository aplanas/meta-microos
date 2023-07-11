SUMMARY = "Metapackage, requires all recommended Packages"
DESCRIPTION = "Metapackage, Requires: all recommended Packages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-recommended-packages-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "7b230607dbd9fda1a65cdb9efc2da9f5499da6fd32e0789403f9c7cf091cd6a2343837df7fcb2236209b16e56976aa36a285baf1a43e994955481646f8d1eaad"

RPROVIDES:${PN} += "R-recommended-packages"

RDEPENDS:${PN} += "R-KernSmooth \
R-MASS \
R-Matrix \
R-base \
R-boot \
R-class \
R-cluster \
R-codetools \
R-foreign \
R-lattice \
R-mgcv \
R-nlme \
R-nnet \
R-rpart \
R-spatial \
R-survival"

inherit rpm
