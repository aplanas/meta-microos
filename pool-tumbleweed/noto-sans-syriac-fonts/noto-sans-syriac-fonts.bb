SUMMARY = "Noto Syriac Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Syriac Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-syriac-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ce6c7bb0f3ec945f9e29596056ac65f8b8edc90b5cce5625b92205978da95d14c31d0080f2ba9102130c7925731dcf3e0de62c943b7e832b393aa0286ca2f9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-syriac \
noto-sans-syriac-fonts \
noto-sans-syriaceastern \
noto-sans-syriaceastern-fonts \
noto-sans-syriacestrangela \
noto-sans-syriacestrangela-fonts \
noto-sans-syriacwestern \
noto-sans-syriacwestern-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
