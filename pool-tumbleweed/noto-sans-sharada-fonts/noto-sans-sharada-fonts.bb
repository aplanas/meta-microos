SUMMARY = "Noto Sharada Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sharada Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sharada-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "1d70bec6ed57763cc37e97beb53d57ba5c31f8f38dbd1a1c2e4d6dcb9645ffc0f34275d26a21e7c7afaaa104e6e7082d5ff55ffe335b2130642c50ea6679c199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sharada \
noto-sans-sharada-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
