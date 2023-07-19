SUMMARY = "Binary files of detex"
DESCRIPTION = "Binary files of detex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-detex-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "e69b11897aa0856a3f9221c77aff53ce87f949ec26ca05f44e4bcae15f2cd8d7d3a3f9e4ea8d9aa595db37f762e8974d10d9e48502039d4e685bc26c45021415"

RPROVIDES:${PN} += "texlive-detex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-detex"

inherit rpm
