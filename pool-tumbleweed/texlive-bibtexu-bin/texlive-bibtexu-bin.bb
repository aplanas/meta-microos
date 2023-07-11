SUMMARY = "Binary files of bibtexu"
DESCRIPTION = "Binary files of bibtexu"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtexu-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "12f36629cde560b27476995a2a39070b01a3e220031274b044de599fa6615b023372a376fc35d1f9796e30e278e0fd1a975604bf035e28c4ecc8aec3e9569a22"

RPROVIDES:${PN} += "texlive-bibtexu-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libkpathsea.so.6 \
texlive-bibtexu"

inherit rpm
