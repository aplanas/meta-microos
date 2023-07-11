SUMMARY = "Noto Tifinagh Tawellemmet Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghTawellemmet Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghtawellemmet-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "4787ec1e89e42e0f4607f9462494d9b786deca77bbaa44e8193996a28e8f7d9e5bf99af596b29923b4327de86925e522e23563b130e6ef2257cb7e0fd6db9cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghtawellemmet \
noto-sans-tifinaghtawellemmet-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
