SUMMARY = "Binary files of cjkutils"
DESCRIPTION = "Binary files of cjkutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cjkutils-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "9ac63bda5d4f560298eef52d8f0be7af285fcbb76f0dd8e34a492c5d57ee96406a30a3bf5e63afeeaa4a0b0ddb16615638734c3a87155df676d053267e5f0b3c"

RPROVIDES:${PN} += "texlive-cjkutils-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-cjkutils"

inherit rpm
