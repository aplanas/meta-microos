SUMMARY = "Noto Meetei Mayek Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MeeteiMayek Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-meeteimayek-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "691be9058e6326c0e9e31a3a6626224bc6af631cf0c91a3ccf3d56be5e7a810fe0af7d8d77b247d1dd026214e89349999d9acca9786f4bde7e1c65baad624d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-meeteimayek \
noto-sans-meeteimayek-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
