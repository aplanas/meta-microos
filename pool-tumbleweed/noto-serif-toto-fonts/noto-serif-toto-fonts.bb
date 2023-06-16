SUMMARY = "Noto Toto Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Toto Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-toto-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "b293cd5b47f83407d760e13f59a707f18ec53dbd430fba86e7c64805cbc730b7833c47a2e43344f2cbedbb292a31c5f29eae6f6fc846ee673fb954350566f61b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-toto \
noto-serif-toto-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
