SUMMARY = "Noto Malayalam Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Malayalam Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-malayalam-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f3a48e60baf6fbbb43f795bf111e8ab8340cbcd1504d6aa56a554eaf50a06ee6f77a4bc09fd7ea180306ed8779a8fad2c8b4c8b2f35a9d5f94d68953066a1cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-malayalam-ui \
noto-sans-malayalam-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
