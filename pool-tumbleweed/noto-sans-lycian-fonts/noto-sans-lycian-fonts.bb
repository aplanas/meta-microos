SUMMARY = "Noto Lycian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lycian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lycian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "55c8361c451ba9c1b52e198f36c3eca87f63fc60fc7830283ee27c354e9681641ec0fb247a8cb8643aecea33472d14b19603b10ee98b1eca1262de449118ca82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lycian \
noto-sans-lycian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
