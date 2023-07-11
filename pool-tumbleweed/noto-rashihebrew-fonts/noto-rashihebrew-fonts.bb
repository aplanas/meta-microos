SUMMARY = "Noto Rashi Hebrew Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
RashiHebrew font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-rashihebrew-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "91b490c0687b363e174e202a8f069226a79f0bde0574b478b207e8224b4cf54729fd3e58c2477c9b4d247a080fea99e6eec7ba5d6d7fa6f064b429a07128e181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-rashihebrew \
noto-rashihebrew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
