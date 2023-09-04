SUMMARY = "Binary files of musixtex"
DESCRIPTION = "Binary files of musixtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37026"

RPM_NAME = "texlive-musixtex-bin-2023.20230311.svn37026-93.2.aarch64.rpm"
RPM_HASH = "46e2b745492d02e5a9ba5e23b242e37bf488457b6170775ebca4d5c0c64eb79886327ec0e47baea24af755072659f3bda41049ae63238eb231dbb74b93ce08b3"

RPROVIDES:${PN} += "texlive-musixtex-bin"

RDEPENDS:${PN} += "texlive-m-tx-bin \
texlive-musixtex \
texlive-pmx-bin"

inherit rpm
