SUMMARY = "Noto Wancho Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Wancho Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-wancho-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ee101c2497382bad8831af6f4c2973c41cc7589e60666502ceb783bf7432ad1ef40fdf92f74f3e2843bba1593ed7853219136ab15701e01c26d86a11130183bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-wancho \
noto-sans-wancho-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
