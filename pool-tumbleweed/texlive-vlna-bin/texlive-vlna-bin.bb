SUMMARY = "Binary files of vlna"
DESCRIPTION = "Binary files of vlna"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-vlna-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "a91c155562bf6095216b8260ef3af688a18221fd9c45a83871f8dc6289f7a9b420a52d83abb94072c102d50ec357127414cdc0246721aebe255447ac95a17986"

RPROVIDES:${PN} += "texlive-vlna-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-vlna"

inherit rpm
