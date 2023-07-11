SUMMARY = "Noto Adlam Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Adlam Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-adlam-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "584372422f247f8a0fe2f2ae307d82b7afc0157c351f5e3cf3ab3adea4b7e18be0857d0550f17688df401f93e014510a85d65268b0f343c58d779e54525a468c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-adlam \
noto-sans-adlam-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
