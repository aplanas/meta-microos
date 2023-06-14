SUMMARY = "Noto Makasar Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Makasar Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-makasar-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "530893f2a0c1cb6aac17f18a6e1429ba1c53bf66fe968e4cdba820a872f9df024ba2052498ae83aa15fbfe3c2aca9b57e0b6eb9850c90ab80a22d20bc7057b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-makasar \
noto-serif-makasar-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
