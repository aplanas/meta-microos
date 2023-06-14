SUMMARY = "Binary files of bibtex8"
DESCRIPTION = "Binary files of bibtex8"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex8-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "c945fa0552b6b9e6d57f57e5729e01c90f281c9176bc2acc3a7bd2229b73dfbda4bb38843b2c60fb598d58dd30a1283b66ca472b76443427508b7b544bdea315"

RPROVIDES:${PN} += "texlive-bibtex8-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex8"

inherit rpm
