SUMMARY = "Binary files of tex"
DESCRIPTION = "Binary files of tex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tex-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "fbf42083ce7fbe2ba65b5ee90233b76e5d4faa65b74509814753ce296315f39760b19bda2167bed74eeea1b772ac8e1d3f1dbcc0568b01dc3ee00b0e52c256dd"

RPROVIDES:${PN} += "texlive-tex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-tex"

inherit rpm
