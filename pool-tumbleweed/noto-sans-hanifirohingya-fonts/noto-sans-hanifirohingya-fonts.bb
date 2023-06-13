SUMMARY = "Noto Hanifi Rohingya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
HanifiRohingya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hanifirohingya-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "568043a486f618bb2a8fcade9ae19738c18e20759a81e68783ca4ac2c036f372aab270340cbc507fe5ccf8fe4299ba9459b2203424a3294d03a4ecef6f5fd6d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hanifirohingya \
noto-sans-hanifirohingya-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
