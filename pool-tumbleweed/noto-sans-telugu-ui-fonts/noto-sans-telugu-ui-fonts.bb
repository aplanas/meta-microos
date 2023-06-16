SUMMARY = "Noto Telugu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Telugu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-telugu-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "af7408477e979e93a009c4678f87ee9d96045e997c44732ce79d1ae06a84d13a3806574aa52071f5bac1c5f7338fa6eb4983a8559a78c6cc8b4f94f5f250c51c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-telugu-ui \
noto-sans-telugu-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
