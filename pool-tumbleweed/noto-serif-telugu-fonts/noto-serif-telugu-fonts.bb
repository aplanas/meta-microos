SUMMARY = "Noto Telugu Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Telugu Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-telugu-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c871e2b33f0908741f15c93a84db698870cf9c865c2fbaaed3c31462b0676cede753135dfb85ce854699275a18f229f3996c94c7de44117729445862cf149497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-telugu \
noto-serif-telugu-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
