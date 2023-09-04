SUMMARY = "Binary files of pmx"
DESCRIPTION = "Binary files of pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pmx-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "083f3ca6be50850ca5dc97a04e8e6521203b155337e398f9afd6c51c4009d09406210abc202d8515e72e20e427705b099594a5f2c122c57c54ca61193890223c"

RPROVIDES:${PN} += "texlive-pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-pmx"

inherit rpm
