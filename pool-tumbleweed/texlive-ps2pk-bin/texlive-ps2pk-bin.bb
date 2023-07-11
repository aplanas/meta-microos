SUMMARY = "Binary files of ps2pk"
DESCRIPTION = "Binary files of ps2pk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ps2pk-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "c1f2636e2183f36f4a97993f1fb690e5e4b2f44262b2dd26f0358215d79bd47c72cae1aaeb178a78de619fc4661b70e28e7df009f5fe95eb3c4ea835c1d65607"

RPROVIDES:${PN} += "texlive-ps2pk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ps2pk"

inherit rpm
