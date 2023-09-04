SUMMARY = "Binary files of bibtex8"
DESCRIPTION = "Binary files of bibtex8"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex8-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "56c44e110586f5b33aae63c5508e0aef51372f11267de288815a54867a019a46ca5f1a7f8940653f907d8220878953afe535fc3ea2e00298feccc84493d4ebc0"

RPROVIDES:${PN} += "texlive-bibtex8-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex8"

inherit rpm
