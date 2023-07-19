SUMMARY = "Binary files of ctie"
DESCRIPTION = "Binary files of ctie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ctie-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "d47619c295d6252cd091ad65da0cf04443ca1b85f6530b15e541fe47eab9e78bf553b16f66e1dfbf18deb1dc300e3b03f3eea2f83d0c9585126661fe66047f01"

RPROVIDES:${PN} += "texlive-ctie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-ctie"

inherit rpm
