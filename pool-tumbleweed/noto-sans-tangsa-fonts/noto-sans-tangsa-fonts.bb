SUMMARY = "Noto Tangsa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tangsa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tangsa-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6f3ec7f0195c2ae920ee02f5834b4688a7320d8cec313dd6b69f53100337720eb21371e28913040c05f82db4948de42f100145c7664b01036ef92a74e30170fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tangsa \
noto-sans-tangsa-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
