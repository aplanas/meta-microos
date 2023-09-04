SUMMARY = "Binary files of tex4ht"
DESCRIPTION = "Binary files of tex4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-tex4ht-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "810b20de9c8ce45d4b02fa23f41fa45cc4916f0d7d260488221ff1e9b3e780d3e73f3f056d8b189cbaa9494eac6ba9b717b10745207586777c8666277884dacb"

RPROVIDES:${PN} += "texlive-tex4ht-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-tex4ht"

inherit rpm
