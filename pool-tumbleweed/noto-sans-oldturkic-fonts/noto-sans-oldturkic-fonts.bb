SUMMARY = "Noto Old Turkic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldTurkic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldturkic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "46067fd3d2e42aa3aeec3627f95166d496699a37c852fa207808535e8d5ff3cb3d26c95ff0cb53109437409a761c39a73fb31ee497eed6fc3ffe54c8323459ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldturkic \
noto-sans-oldturkic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
