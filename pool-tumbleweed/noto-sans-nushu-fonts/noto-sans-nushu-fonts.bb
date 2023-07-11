SUMMARY = "Noto Nushu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Nushu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-nushu-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "02af20a4449310e9e4061f6a4c8d604c56b84ecc6a2490d90039ba8d10c91f998833ea603d6c8a6482549f769832aa24bb974a80cb579286cad814708dc25634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-nushu \
noto-sans-nushu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
