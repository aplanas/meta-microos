SUMMARY = "Binary files of bibtex"
DESCRIPTION = "Binary files of bibtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "f40c31e307fa5cb1cd536306e668b5a938ce9558df7e959ec4915f42dfaf4d73079dd671c7274791bb6c15e47fe25875d5ec2f9477a11ba2cdbd4ba8f932e2c1"

RPROVIDES:${PN} += "texlive-bibtex-bin \
texlive-bibtex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-bibtex"

inherit rpm