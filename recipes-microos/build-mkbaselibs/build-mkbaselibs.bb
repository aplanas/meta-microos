SUMMARY = "Tools to generate base lib packages"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating base lib packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230502"

RPM_NAME = "build-mkbaselibs-20230502-1.1.noarch.rpm"
RPM_HASH = "931214764747fe3322c97d202711ce9afdd226a93dbf95dfe9678c0bd47c6d56cba898d536b1bb53c42f1f830b34b40a648fc4e6128f24d5b22c73afca84a785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkbaselibs"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
