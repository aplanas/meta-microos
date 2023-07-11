SUMMARY = "Noto Sans Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sans font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9f7330a8be1ba7c640121a40d80518f1fbce07ca7425b3c3a3fc3d31b8a5ec9eca9d4d56b7a1e64e64da4016931cb795e36829e3ea237328c59b53057f82c79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans \
noto-sans-display \
noto-sans-display-fonts \
noto-sans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
