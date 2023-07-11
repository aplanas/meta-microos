SUMMARY = "Noto Old Hungarian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldHungarian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldhungarian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b36ecc36149671c389f2a135af399b963aa0f97856b4e2da90dccd1ecd9f67a2feb81a31f3161fbe99edbbbaff593d9a2c6b8d88dc5966575d163efb42434507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldhungarian \
noto-sans-oldhungarian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
