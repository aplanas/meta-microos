SUMMARY = "Binary files of dvipos"
DESCRIPTION = "Binary files of dvipos"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-dvipos-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "c53a39d7e7d96848ab06f6dd618fe594fafb1f110be17f7029c295e9e7b43c81880aad58a5b27b2b6bdfe9abd265063482b2e63dc73de755409712613d13dbaa"

RPROVIDES:${PN} += "texlive-dvipos-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dvipos"

inherit rpm
