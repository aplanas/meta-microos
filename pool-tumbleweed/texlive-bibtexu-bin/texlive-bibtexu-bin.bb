SUMMARY = "Binary files of bibtexu"
DESCRIPTION = "Binary files of bibtexu"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtexu-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "9e5930ae8edeac881eec8748db882644f5fec146c6122897ad87acb312a00ab966bafae37ca62df23117fd928b826241514c6225038b744c8107b18e78ddd0b3"

RPROVIDES:${PN} += "texlive-bibtexu-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libkpathsea.so.6 \
texlive-bibtexu"

inherit rpm
