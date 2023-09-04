SUMMARY = "Binary files of ps2pk"
DESCRIPTION = "Binary files of ps2pk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ps2pk-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "2e9cec06778e4721ef33d0b0dcf9a2f8f1bed0799004d080949d9cdf9a4bbaa59407ec24854f054bc49a06e8b01193508d5b053ed944fb3e4616a566808cc217"

RPROVIDES:${PN} += "texlive-ps2pk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ps2pk"

inherit rpm
