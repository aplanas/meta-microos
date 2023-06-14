SUMMARY = "Noto Ethiopic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ethiopic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-ethiopic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "310f69f918df2aafedf4d7c080b8b51bf50e2528a85b84fa7257a57261ed2bc8dbef91d758d526ed288ae009c3964210fb117ed07e3c9edf0803d9037cf8ca79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-ethiopic \
noto-sans-ethiopic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
