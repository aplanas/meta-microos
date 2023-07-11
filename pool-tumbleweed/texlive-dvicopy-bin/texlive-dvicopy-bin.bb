SUMMARY = "Binary files of dvicopy"
DESCRIPTION = "Binary files of dvicopy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvicopy-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "c5f18e478270b7ec58aede4e4dd1d6be11ae0311b7b8a0269f89aa886204b1ec573ee288b22fa18358b092f76504ab4ff24c36e1ad4f8267796ec72a0e830f44"

RPROVIDES:${PN} += "texlive-dvicopy-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dvicopy"

inherit rpm
