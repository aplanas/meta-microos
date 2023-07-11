SUMMARY = "Noto Old Sogdian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldSogdian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldsogdian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "3506a4ec6baf528f7413dcafc18a7a8a38c18af79cea414047dfcce30c738fcd5791a27ed2d68d6f040680b217f08f8a3cd6a69c28d60ae4ae046d2bdb7cbca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldsogdian \
noto-sans-oldsogdian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
