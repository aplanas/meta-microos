SUMMARY = "Noto Saurashtra Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Saurashtra Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-saurashtra-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9227e8ba957a3393e551f9e1d423752f4f9ab085e14bfb98261ef1f7af5f65d6eb85826e8bcb2a7a51e5993ec73dc6c1fd5a2808a912d8a1d548ee0e915f04b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-saurashtra \
noto-sans-saurashtra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
