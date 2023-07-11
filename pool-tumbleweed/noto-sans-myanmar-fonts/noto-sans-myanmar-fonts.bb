SUMMARY = "Noto Myanmar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Myanmar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-myanmar-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "996865589302be5796e467bd2e7993a0ca6420ec2fb0318e48b974eceb7648048eed9a21e5b9924ecb5c757d56f7ce3ad170f3e1445ca252de9ca90e4c7dc2b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-myanmar \
noto-sans-myanmar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
