SUMMARY = "Binary files of dvidvi"
DESCRIPTION = "Binary files of dvidvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvidvi-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "36e9fe293407fd0d894292094f47feab24d590b426cabea8f08655735a0ea5fb62499fd96994f813f5c8c21bfc08c632fd131421cadd1cfcc72a6b32fa68b0a4"

RPROVIDES:${PN} += "texlive-dvidvi-bin \
texlive-dvidvi-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
texlive-dvidvi"

inherit rpm
