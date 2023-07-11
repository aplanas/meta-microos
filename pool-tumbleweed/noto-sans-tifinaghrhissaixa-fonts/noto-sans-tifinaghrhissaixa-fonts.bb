SUMMARY = "Noto Tifinagh Rhissa Ixa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghRhissaIxa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghrhissaixa-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "3e41f57759fe8aed4c30c1906b0be3f9398fec2612bfec2250024bff0c30026d9e0f2dd1d58e98358031cd0a0a18d07e9e73d271e6f4bf01c740257aeee4eedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghrhissaixa \
noto-sans-tifinaghrhissaixa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
