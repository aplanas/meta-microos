SUMMARY = "A ligatureless variant of the Kende Old Hungarian font"
DESCRIPTION = "Roga is the ligatureless version of the Kende font. Both are fonts \
for the Old Hungarian script."
LICENSE = "OFL-1.1"

PV = "20221112"

RPM_NAME = "rovasiras-roga-fonts-20221112-1.1.noarch.rpm"
RPM_HASH = "3353212e81b24f84ca020e2625933e8ae3c0050ea534ae9801b9d07acd0fbaf21b0a2d6baaa245a826ec7a3484939e52e88b87fc31c31c7c6adb929e5e1f5b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rovasiras-roga-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
