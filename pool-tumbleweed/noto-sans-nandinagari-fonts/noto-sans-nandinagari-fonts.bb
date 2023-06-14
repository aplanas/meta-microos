SUMMARY = "Noto Nandinagari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nandinagari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-nandinagari-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "d097b610d2c2b37ec46c23fe9c77bb5a0cee5aee6fcbf5d4268f18808c085a577102508a4f4ef484a4738d2b281a102058fdfc6b7f30485feb4049f6a4b27d73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-nandinagari \
noto-sans-nandinagari-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
