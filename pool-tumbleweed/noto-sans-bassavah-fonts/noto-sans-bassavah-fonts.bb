SUMMARY = "Noto Bassa Vah Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
BassaVah Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bassavah-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "d27a6430d92c3b05e102be6d633b3cb63d47b42682a8ffdb15d5855f79ca6f11400542840135a0f6b65f644c4e2575208cc81e6cb11f981a00b038ec8427f075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bassavah \
noto-sans-bassavah-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
