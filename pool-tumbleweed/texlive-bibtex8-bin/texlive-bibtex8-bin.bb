SUMMARY = "Binary files of bibtex8"
DESCRIPTION = "Binary files of bibtex8"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex8-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "8bab9f1debd109b70828eb8dd9be7306cbf8533a825f05c91bc9c600eae64220a2e6b9a501ca75feb762488a005c9da48ac74db4d41908f5b3773835c4e1bac5"

RPROVIDES:${PN} += "texlive-bibtex8-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-bibtex8"

inherit rpm
