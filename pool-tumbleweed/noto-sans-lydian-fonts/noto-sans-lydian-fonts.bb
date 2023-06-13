SUMMARY = "Noto Lydian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lydian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lydian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e987e3eef16958d9a566a9c6c86c1af20533251cab8597a2c3f91bc8e103ac030bc57f29770cc8ddbc3de0700621c1762fc2019f571347f1ddb54d194c6f9455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lydian \
noto-sans-lydian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
