SUMMARY = "Noto Ethiopic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ethiopic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-ethiopic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ec8abbd6ca5b183ffe94f2475e8026fa05ed682eee5f75a1cd3a4549d70a3f4d442f2569a4821740cc8402c98bdb18badbb073e0cf132c7f7409dfc02bfc666b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-ethiopic \
noto-sans-ethiopic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
