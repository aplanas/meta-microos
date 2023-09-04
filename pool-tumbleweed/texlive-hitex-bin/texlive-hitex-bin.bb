SUMMARY = "Binary files of hitex"
DESCRIPTION = "Binary files of hitex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-hitex-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "36be8beb737325e2ce3ef72be0f6a1b1561c96af9c3edba49be038531efcbbc0c330172a569e0e3b8ee9e4767aeb81670c383cc1c170568f714297f68ed02e88"

RPROVIDES:${PN} += "texlive-hitex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libz.so.1 \
texlive-hitex"

inherit rpm
