SUMMARY = "Noto Cypro Minoan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CyproMinoan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cyprominoan-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ea2b5a0a04acf5c9f91efd86b709408c3e9adf7a00dcef65e6897354f84054f3335d6d45abaa4eef1bfab8e9156db49056d159a8696204737075011acc58e948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cyprominoan \
noto-sans-cyprominoan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
