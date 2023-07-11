SUMMARY = "Binary files of synctex"
DESCRIPTION = "Binary files of synctex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-synctex-bin-2023.20230311.svn66084-92.1.aarch64.rpm"
RPM_HASH = "d6ac838a0e57b7f88e6a9dfd89ce7f7ef34c5c344decbbad4301ae252c510338b5e7fbec1e039c26a66fe1ac5dbf75986cd5fab63a2f08ac6055326f2daf0d82"

RPROVIDES:${PN} += "texlive-synctex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsynctex.so.2 \
texlive-synctex"

inherit rpm
