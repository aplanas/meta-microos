SUMMARY = "Noto Georgian Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Georgian Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-georgian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "a0509f3ec468a47791316cad40a2959371578f5994ffb80e3099577fe9df9717c27f8839b69ecaa243ba7211c19ffd73c9e338f9d3db5d91d5ce9fccd9c6da13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-georgian \
noto-serif-georgian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
