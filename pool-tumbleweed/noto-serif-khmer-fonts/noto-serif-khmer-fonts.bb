SUMMARY = "Noto Khmer Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khmer Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-khmer-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "648da2647439ad499d2f0fbd1f704ef8ab79072edf67f88b251d5e73518cb0edfa6df27a5df031965500864d92bb137f4ff27815f45933cb9a8c13d6112f9952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-khmer \
noto-serif-khmer-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
