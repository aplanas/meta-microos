SUMMARY = "Noto Ugaritic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ugaritic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-ugaritic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "5dd0496193454ccf3458e80c7d54495ce4a4a1fbde007fd7630e52ea59b7967a10b43a19938219c142e786e950e9e4b43258a7b396a295f0dddcde6737c2e8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-ugaritic \
noto-sans-ugaritic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
