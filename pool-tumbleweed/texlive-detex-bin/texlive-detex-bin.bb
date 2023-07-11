SUMMARY = "Binary files of detex"
DESCRIPTION = "Binary files of detex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-detex-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "06ee512f82a5db1321a7f07f3e1677d9d4d9d3ad6b7d4e97e85d502f96a1d65a93a225a6c56c438aa1967319d76e933cf89343fddf1854bb25737cb095b32d96"

RPROVIDES:${PN} += "texlive-detex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-detex"

inherit rpm
