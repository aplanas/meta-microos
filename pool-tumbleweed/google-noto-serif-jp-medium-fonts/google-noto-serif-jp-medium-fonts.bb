SUMMARY = "Noto Serif Japanese Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Medium weight of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-medium-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "78362b24c8c16d556053da41f703c7f8bbd27a29004e4036a0a0c82bf5b0a896f91036de31ea8ce48feefc1012722c227762e8e6ac48217b5938753b8b49c770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-medium-fonts \
noto-serif-jp-medium-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
