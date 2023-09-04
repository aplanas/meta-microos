SUMMARY = "Binary files of bibtex"
DESCRIPTION = "Binary files of bibtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "5b149d428ebb7b1534aa440f5a5fb5776d842ccd7115e613991f8b2310bbc8533d9e90dacc7d8a088c39af726e97f2f1d4ed5cf41ed5f56efcd29b640facc15e"

RPROVIDES:${PN} += "texlive-bibtex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex"

inherit rpm
