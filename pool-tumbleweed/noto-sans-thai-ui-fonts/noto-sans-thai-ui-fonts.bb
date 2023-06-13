SUMMARY = "Noto Thai Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thai Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-thai-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6a23c0d5828b198dc2937b9edc0cb5f18cb1eb35b6233a10ac1290882dd054cdf6e685e302cb6a49c91211e7716caa513fe7b75a7c781e094f63f50eba47bccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-thai-ui \
noto-sans-thai-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
