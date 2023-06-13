SUMMARY = "Noto Myanmar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Myanmar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-myanmar-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ffcd35bca15cbe20032fee5cbf431c4188538682506193feac01f58fbef912a37aa5fe74a8ead4addf5185d476f01c27ba1e3c4df029cb52284a9edf65a91954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-myanmar \
noto-sans-myanmar-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
