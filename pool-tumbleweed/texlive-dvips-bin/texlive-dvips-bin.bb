SUMMARY = "Binary files of dvips"
DESCRIPTION = "Binary files of dvips"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvips-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "c577b7da767f5d89f6e4ff6d9f128acc0c7e4a0c3f7c97bb672479965a99032f9c8d69ac58ef54ebce6ff504cb1aea0e8ef0234a308be068213933ab3ca325d4"

RPROVIDES:${PN} += "texlive-dvips-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvips"

inherit rpm
