SUMMARY = "Noto Pau Cin Hau Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PauCinHau Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-paucinhau-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "884beaa47c8ce7fd15801287c55db0df130b4ddae87c3f32c46a29af9d6f00a56fe15730b1a1b7707cc72ee66e30cd60706debf933e23f760e383bc03c4a6c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-paucinhau \
noto-sans-paucinhau-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
