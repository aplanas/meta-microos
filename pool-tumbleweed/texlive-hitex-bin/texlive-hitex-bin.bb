SUMMARY = "Binary files of hitex"
DESCRIPTION = "Binary files of hitex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-hitex-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "98ceb604a32d9f336e41f3ab2fb166f3841cba837f0106496ab5b7ec7fc878ee9113004ad6fbc097810f179a13a8711ae684b647a868f013c28efa8d664b7a96"

RPROVIDES:${PN} += "texlive-hitex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libz.so.1 \
texlive-hitex"

inherit rpm
