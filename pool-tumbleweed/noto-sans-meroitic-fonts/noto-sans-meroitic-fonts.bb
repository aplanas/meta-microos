SUMMARY = "Noto Meroitic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Meroitic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-meroitic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "598aeabadf02f798881ac788996d4a7c5d66985faa978536fb3672e47d929b697daa294e3d2e566cd518cd6bf993689bc196eeb253bce652c5dcfed6120b15c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-meroitic \
noto-sans-meroitic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
