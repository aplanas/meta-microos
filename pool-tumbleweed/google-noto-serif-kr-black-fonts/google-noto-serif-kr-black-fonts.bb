SUMMARY = "Noto Serif Korean Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Black weight of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-black-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "210324deaec77c96daada8687b9822958f0fe3bcea1d046ea985cee443cf58f406ab3f5ee67061a832e5eccd55c0f68cf3ea2e706c131fe2156ca3c67dd6e3be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-black-fonts \
noto-serif-kr-black-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
