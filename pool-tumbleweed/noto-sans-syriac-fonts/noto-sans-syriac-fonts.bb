SUMMARY = "Noto Syriac Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Syriac Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-syriac-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ef76b96960437412b078c21fd52eb60e2b9033b887e3aeb6039bb37364f78e65884572312398388fee6f5f9b5a660163c0796be62303de1d43f51f2ced29e3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-syriac \
noto-sans-syriac-fonts \
noto-sans-syriaceastern \
noto-sans-syriaceastern-fonts \
noto-sans-syriacestrangela \
noto-sans-syriacestrangela-fonts \
noto-sans-syriacwestern \
noto-sans-syriacwestern-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
