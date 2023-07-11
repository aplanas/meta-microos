SUMMARY = "Noto Grantha Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Grantha Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-grantha-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "e86b08f916fd3e8a76a9ffaca3bd870a5bd9583a6174ac31180d721ca1cce3a96d4d58330d834af80a47a5c4d099588ab278352334019f5f3afd2f7721bd0b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-grantha \
noto-serif-grantha-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
