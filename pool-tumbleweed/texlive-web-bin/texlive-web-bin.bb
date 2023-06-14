SUMMARY = "Binary files of web"
DESCRIPTION = "Binary files of web"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-web-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "0e93338e19b514cef4df33443a87cc01d650e7b22bf6dae68d51ba5ccdb6d52bd33b90b4e8d1aa16473c949d1c4421447f821e8f4aa5d8b31a6d746fe3f10c1d"

RPROVIDES:${PN} += "texlive-web-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-web"

inherit rpm
