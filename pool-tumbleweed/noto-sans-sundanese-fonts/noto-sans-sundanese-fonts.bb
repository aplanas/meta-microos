SUMMARY = "Noto Sundanese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sundanese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sundanese-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "46f057ccd1ba22ee7627456f26f2cef22b699c246a766028e3cca139e5967bc85c19ef1ef2ec980f7d7e6384ae25f50b4cd8a57ad776c5b4e9c7a4a46660b2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sundanese \
noto-sans-sundanese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
