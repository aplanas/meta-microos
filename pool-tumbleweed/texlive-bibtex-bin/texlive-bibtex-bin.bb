SUMMARY = "Binary files of bibtex"
DESCRIPTION = "Binary files of bibtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "67a8d47af7bf1c0ce3b4136e7968d6d5c6a1d95b0c413340b17823f0ec3525f7f68cb4075bf489cb5687d3907fadb3bd206e95298a558884c27a36aa61735925"

RPROVIDES:${PN} += "texlive-bibtex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex"

inherit rpm
