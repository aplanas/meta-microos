SUMMARY = "Noto Buginese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Buginese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-buginese-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "42253d29bba26eb2899c80ea2ebbfc9343583249b07980d07bbdd84fd8821934ebde249c7450c9705c8ca79414451d420469fb6d4a360a81b5d56e10bdf83725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-buginese \
noto-sans-buginese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
