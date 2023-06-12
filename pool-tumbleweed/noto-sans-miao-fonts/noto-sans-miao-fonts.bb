SUMMARY = "Noto Miao Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Miao Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-miao-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f689a003a4602b167195b87eb93568b75201ce90816742c7d249498d8cd781e49696298c6919a96755c5bb848aa17e951f4a5a026b1842c470994c94d358d5ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-miao \
noto-sans-miao-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
