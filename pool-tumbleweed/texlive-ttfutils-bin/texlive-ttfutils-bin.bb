SUMMARY = "Binary files of ttfutils"
DESCRIPTION = "Binary files of ttfutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ttfutils-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "5c430b8103c6bb24d43e1eddd52e82ae404d77e36c4b205b4dde987cb01626bdb04568ce60f74667d434b21ffbec3fb86b11fafe338600b79f425c137d390a06"

RPROVIDES:${PN} += "texlive-ttfutils-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ttfutils"

inherit rpm
