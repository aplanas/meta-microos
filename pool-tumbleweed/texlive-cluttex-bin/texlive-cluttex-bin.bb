SUMMARY = "Binary files of cluttex"
DESCRIPTION = "Binary files of cluttex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48871"

RPM_NAME = "texlive-cluttex-bin-2023.20230311.svn48871-91.1.aarch64.rpm"
RPM_HASH = "b092a657d9d8b792743d275a9bc05493db287109e0bb3e5c281c7ebee8c0c61cf8e2d4f5e06be8c8e12fa35c410e59d25b31f989750327aedac97be5b7937319"

RPROVIDES:${PN} += "texlive-cluttex-bin \
texlive-cluttex-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-cluttex"

inherit rpm
