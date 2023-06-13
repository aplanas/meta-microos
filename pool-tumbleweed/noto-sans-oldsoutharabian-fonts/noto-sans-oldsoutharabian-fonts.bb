SUMMARY = "Noto Old South Arabian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldSouthArabian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldsoutharabian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "152daff834ff76518cc20110bc38ea2d9eac37d8cfb56298918fa64991072fc234555525defb1b07057ec8fd55439f8b86385104e0f343e791401d4ca886a6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldsoutharabian \
noto-sans-oldsoutharabian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
