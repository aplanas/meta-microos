SUMMARY = "Noto Manichaean Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Manichaean Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-manichaean-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "97268a4353b77ce32dcd5f72791edddfd5371f4afa5bb3fdecca602f92525b647aee4404a9392809aca58160a2384b946e4ae58bc45aa37d9e720f0a04bc60d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-manichaean \
noto-sans-manichaean-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
