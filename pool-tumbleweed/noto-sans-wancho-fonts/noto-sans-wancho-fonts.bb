SUMMARY = "Noto Wancho Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Wancho Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-wancho-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ce3521fee50e48501ac4927b75f2cb647b2ff61bc6065822c7ead0ae0b6527c6798cc549852e24f5c7c2360d70a2139240151e32f52731307694bfcd9884292d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-wancho \
noto-sans-wancho-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
