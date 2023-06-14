SUMMARY = "Binary files of ps2pk"
DESCRIPTION = "Binary files of ps2pk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ps2pk-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "51e6dc85c472df620a2ad1bf5018a0dd384737023626710ae0c4adf048014c5765e21e83651efe248c1b4a08ba7bd4cef2a2391c376fb7101d9a2d5bdc7be26b"

RPROVIDES:${PN} += "texlive-ps2pk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ps2pk"

inherit rpm
