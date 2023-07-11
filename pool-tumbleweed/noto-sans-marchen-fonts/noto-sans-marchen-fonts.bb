SUMMARY = "Noto Marchen Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Marchen Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-marchen-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "6d9e0002260935cd3233817f6441ee209bd3e3536f5c9596ee378e30265e81bbe163db6738e2c7b6eb2201dd45d55728ef1913264a759e6deb011403b1e6653f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-marchen \
noto-sans-marchen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
