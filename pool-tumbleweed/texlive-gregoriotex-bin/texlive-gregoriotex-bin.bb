SUMMARY = "Binary files of gregoriotex"
DESCRIPTION = "Binary files of gregoriotex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gregoriotex-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "92e1ace66f706fb4f48bd5b7b854880f65026e3b8adacb4c720cbe21707e8f904b5bf7e6578c77202e3b06dec599a8bd6037b4fbde36498f8e9869f60863c677"

RPROVIDES:${PN} += "texlive-gregoriotex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-gregoriotex"

inherit rpm
