SUMMARY = "Binary files of luahbtex"
DESCRIPTION = "Binary files of luahbtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luahbtex-bin-2023.20230311.svn66511-92.1.aarch64.rpm"
RPM_HASH = "e25b4aec82030def0f7357a42c1af5388f2286c13ec0fc1f3323a2bc5d7c2e2cf8488f8eb076ddef06937884e53a02aae998b1fda9af25dbfc46e775a789168c"

RPROVIDES:${PN} += "texlive-luahbtex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libtexlua53.so.5 \
libz.so.1 \
libzzip.so.13 \
texlive-luahbtex"

inherit rpm
