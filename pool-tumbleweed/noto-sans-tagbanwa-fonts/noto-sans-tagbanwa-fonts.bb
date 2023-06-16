SUMMARY = "Noto Tagbanwa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tagbanwa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tagbanwa-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "a5b44ac8fdb5041fd1b9d5bbe9960045b0d1992a7181857517017f659ff973ca48088c16ef4a21d55ed038a6db906ac9cc230de864608e4f1e9bc50bbeb16177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tagbanwa \
noto-sans-tagbanwa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
