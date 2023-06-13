SUMMARY = "Noto Elbasan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Elbasan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-elbasan-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e51a292bbdb2b49a32a182ef92e5609c5fa3005013fbfbd542767575a7f8574f0ffdb054028ca2e7fab9e1b32fc7cf3c0fb33851a404bf55dcc39a6b2964f9ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-elbasan \
noto-sans-elbasan-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
