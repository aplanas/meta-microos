SUMMARY = "Noto Duployan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Duployan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-duployan-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "92d3958e0ffbb711c971c8b7b5f85647f6ca7bf23a6edc36a2a8a432babd0661a3cab29130aa77281367289ba1b4360840f92df9dd647180ad527c885482ea0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-duployan \
noto-sans-duployan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
