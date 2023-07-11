SUMMARY = "Noto NKo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NKo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-nko-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "0d9d82a17badd6774e1c43ee6e6075a95c9c29e4de75801deb0de95b59961a776bad12419d12ecdad18c322d3284b69812edf6bdfd564fc1b22acb553b3f7f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-nko \
noto-sans-nko-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
