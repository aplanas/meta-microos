SUMMARY = "Binary files of dtl"
DESCRIPTION = "Binary files of dtl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dtl-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "5a0bfb7e631ae80bb6bb174bbec109670824a5ff4a8c55023ddb77408da4f8d8f6513d67ea419a4b322d10b31e3b8606ca489d8c96083f581d184b2d47be7442"

RPROVIDES:${PN} += "texlive-dtl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dtl"

inherit rpm
