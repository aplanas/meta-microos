SUMMARY = "Noto Siddham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Siddham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-siddham-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "0a0556a7fc5b4602b887291d16485ae8a81415120d2c07e73307fd3e906a78173bc6853a203868b6a0db5b3db73cec3921b4ec26b7e846f953483d27004372f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-siddham \
noto-sans-siddham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
