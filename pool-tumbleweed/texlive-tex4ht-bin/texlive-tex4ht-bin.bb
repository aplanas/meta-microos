SUMMARY = "Binary files of tex4ht"
DESCRIPTION = "Binary files of tex4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-tex4ht-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "bc2d3ad77d8c8958a2e5597a70aa8254c0c2af702b0cb04c2e3fd0408cccb7b0a3d6c90bf6d221929154ecf7cc97158f8517a3dcc348ffeefcd70b9fa3d77f35"

RPROVIDES:${PN} += "texlive-tex4ht-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-tex4ht"

inherit rpm
