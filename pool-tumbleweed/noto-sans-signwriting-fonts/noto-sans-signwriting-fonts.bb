SUMMARY = "Noto Sign Writing Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SignWriting Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-signwriting-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "dc250fb24988af82bfe3ce8664f79be6eed0cfa1803b4003bafd57ac3d8150dbf64f99dcbef0fed4c5b9a7211ec2242d6ad997380bda46a75524e1c31280030e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-signwriting \
noto-sans-signwriting-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
