SUMMARY = "Binary files of tex"
DESCRIPTION = "Binary files of tex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tex-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "086fd1b530e743e3f143fe808e244e319aaa6514c9c1d3c451f54a4e2ab0e4fddaa8ba242ca490af43ea4117695c60e3fde188731305087585714f6443ab587d"

RPROVIDES:${PN} += "texlive-tex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-tex"

inherit rpm
