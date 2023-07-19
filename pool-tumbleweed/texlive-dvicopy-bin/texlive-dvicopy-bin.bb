SUMMARY = "Binary files of dvicopy"
DESCRIPTION = "Binary files of dvicopy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvicopy-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "e8100d500ea70f32d4b9c5781aa3a9615813557fd36f5303804d61ce6997dcbcbb9c91802f7cdadd4b60b36814a4fce859a5e837399eb966e2e44ff37c1e93a7"

RPROVIDES:${PN} += "texlive-dvicopy-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dvicopy"

inherit rpm
