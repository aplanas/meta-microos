SUMMARY = "Noto Rashi Hebrew Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
RashiHebrew font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-rashihebrew-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "bf31f3c1a939c6548ce3d0f6e3e42b809a84d13727a83e7a73dfdaf239e316dd5450b4ec9ee35187e83a9882b28d6a203087a38eb83ba7439a07c681bfa2b603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-rashihebrew \
noto-rashihebrew-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
