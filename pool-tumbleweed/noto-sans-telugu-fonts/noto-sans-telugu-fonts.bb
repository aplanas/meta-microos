SUMMARY = "Noto Telugu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Telugu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-telugu-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2de60081309b9acbf5a1b8c6791d2cf71636d6e07692408fa2d5293ab766b25aa80fb6ba8962b131000ea2398d39f8907eefbfaa0818bf55fb495dc6faf574f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-telugu \
noto-sans-telugu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
