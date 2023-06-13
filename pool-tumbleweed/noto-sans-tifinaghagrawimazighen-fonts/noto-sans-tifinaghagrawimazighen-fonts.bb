SUMMARY = "Noto Tifinagh Agraw Imazighen Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAgrawImazighen Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghagrawimazighen-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "5766c256e3cbdb30d2ba1a809ae5d9fa9c83d250c39f026231f5466fbe506721b2d906a214ad8458dd3cb39024b3bdea96aab94324130408351b292e22f73ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghagrawimazighen \
noto-sans-tifinaghagrawimazighen-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
