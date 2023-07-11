SUMMARY = "Noto Miao Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Miao Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-miao-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "877cfd55058f8d9e6f0ab6c2fa6ebedbb18f33fff375e2f8645d3e044dd39aad3c1a1a8227ee439a2fb1fc67fbf2c270bcb46bf8748ab73e2d45b35784e918bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-miao \
noto-sans-miao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
