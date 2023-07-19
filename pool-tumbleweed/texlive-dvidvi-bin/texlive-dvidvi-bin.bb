SUMMARY = "Binary files of dvidvi"
DESCRIPTION = "Binary files of dvidvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvidvi-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "50b69022292d85b13caae40121e895f313de37bf19bc06a3a72a850289e782e7d1c191bf1e9caf9bea999953ddd1ebdeb95fd5b1182dd70174052a5fe5a4ddcc"

RPROVIDES:${PN} += "texlive-dvidvi-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-dvidvi"

inherit rpm
