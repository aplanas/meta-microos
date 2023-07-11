SUMMARY = "Noto Meetei Mayek Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MeeteiMayek Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-meeteimayek-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "84b6d1f6103b8ac750b5581fa71e5c60ccf17dec00d052b7667e82cf239ae9f3458081ae94158a685ec159e051cf674d09f12762b1d6758da2017cdf1af03807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-meeteimayek \
noto-sans-meeteimayek-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
