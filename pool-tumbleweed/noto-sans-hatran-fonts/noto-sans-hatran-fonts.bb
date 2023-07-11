SUMMARY = "Noto Hatran Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hatran Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hatran-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9f70cad00d03d076d7bd462081770a2d5dbc48691c427ce1c1802eba6c1442d8456126246689e2567653deb3992410c9592bbdba1933eaa8dbe40f473cb1df40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hatran \
noto-sans-hatran-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
