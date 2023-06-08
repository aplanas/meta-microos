SUMMARY = "Metapackage, requires all recommended Packages"
DESCRIPTION = "Metapackage, Requires: all recommended Packages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-recommended-packages-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "5822794119f366fb13166d3cceeac9f6621549ecd1230456ea5004e021aeb914d84af8f5399069cc581f4e4ff6cbddc7ca55d262bc8068400bb5790b305f3dcc"

RPROVIDES:${PN} += "R-recommended-packages R-recommended-packages(aarch-64)"
RDEPENDS:${PN} += "R-KernSmooth R-MASS R-Matrix R-base R-boot R-class R-cluster R-codetools R-foreign R-lattice R-mgcv R-nlme R-nnet R-rpart R-spatial R-survival"

inherit rpm
