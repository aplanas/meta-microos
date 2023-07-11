SUMMARY = "Noto Nastaliq Urdu Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NastaliqUrdu font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-nastaliqurdu-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "baf09f75be8cde6fffc5de8a06dc97463130214927eb6a336c9835fafd33184503f56b78195f5aac0d131d515aacfaddf40d3e3c5d352a8f9b89525c181ae879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-nastaliqurdu \
noto-nastaliqurdu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
