SUMMARY = "Noto Lisu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lisu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lisu-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f8ca26191640531c7807a6371869c5af77a70d5d37b05840360054815546b4304b3f6033c550f43043d3e752a8c5799134536af590bbc8834d51045945fcc3bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lisu \
noto-sans-lisu-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
