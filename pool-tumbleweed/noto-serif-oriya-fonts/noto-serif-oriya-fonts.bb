SUMMARY = "Noto Oriya Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Oriya Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-oriya-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "9d32e6396d9adabe1ea7837992c80872ebc9c1076993d8dee51fdd0162e34ddc0b4b23a936d9ed9121f05e979c8f1ec8c5350fcc90bc9334e96ed81df8805a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-oriya \
noto-serif-oriya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
