SUMMARY = "Noto Yi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Yi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-yi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "85ae6f085c827ae74fb6b66e762d8d0e27e8013c9078a21db26dd22d45b1135f8ddc85a3080706482e4a7f280a33b24bea648f1c9801977365232eb79b6caf6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-yi \
noto-sans-yi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
