SUMMARY = "Noto Thai Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thai Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-thai-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "36670a8d05fb51af7e7d52f949a413648635dfc11aac523c2dbcc298e006ca89ed5e7f22ac8179cb9b393cede038bd2f9a5c2941cebdcfea85fb48fbff7071af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-thai \
noto-serif-thai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
