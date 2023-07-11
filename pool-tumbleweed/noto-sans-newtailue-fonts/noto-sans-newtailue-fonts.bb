SUMMARY = "Noto New Tai Lue Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NewTaiLue Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-newtailue-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "c56e202e10e49e20545a5689f644dc648f101dcc91d6da8c6003824f3b69fe69b5cf08d231f34cdc3cce528695a0e11201cb7b0ef260f6e6527070902d966764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-newtailue \
noto-sans-newtailue-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
