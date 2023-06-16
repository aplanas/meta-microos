SUMMARY = "Noto Looped Lao Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LoopedLao font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-loopedlao-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "4dce2e2c441c129a452a7b4d50aab8fcab12dbc2f08880f50da4fd52e710621b04cbfa93e5518c50e91caab48301c75316ea4d6f0a54c16e5ff1d6e51d25970c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-loopedlao \
noto-loopedlao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
