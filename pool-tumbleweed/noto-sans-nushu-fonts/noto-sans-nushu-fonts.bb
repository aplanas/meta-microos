SUMMARY = "Noto Nushu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nushu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-nushu-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "122dfee15bb0972172f09681fe67025513415a9eb8aafc339a7f7659bf1704de7a029338c6a8b97186a54b700e074db68e410c8e13f5045a545d3b7536bbb582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-nushu \
noto-sans-nushu-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
