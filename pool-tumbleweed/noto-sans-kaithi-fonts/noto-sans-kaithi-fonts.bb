SUMMARY = "Noto Kaithi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kaithi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kaithi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "6fa27716d31bcde22fe6e111f9afb283022069ff68a05b419a279231f40c377c5ebdadc62f22fe9fbd891d99c63964f51e7fb82ee71333c839cd376813d8f916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kaithi \
noto-sans-kaithi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
