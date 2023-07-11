SUMMARY = "Noto Meroitic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Meroitic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-meroitic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "6dc7a83a59842729ca566c75435be02dd72cb4f7eff310a8ec421b260eb51fa55bfe4da084c63d36540f597c7df440074ea22d2da2ff060d60ac343b5e67c841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-meroitic \
noto-sans-meroitic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
