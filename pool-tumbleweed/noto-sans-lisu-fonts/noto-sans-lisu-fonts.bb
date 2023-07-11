SUMMARY = "Noto Lisu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lisu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lisu-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "04841f764f8e5e098d4492a4741eec9297e4b746bebee9dfb5e6baa4f9c0a11cde4f38448fcc6db35ae7806f6c604564f0792232624618d515c45e550a736e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lisu \
noto-sans-lisu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
