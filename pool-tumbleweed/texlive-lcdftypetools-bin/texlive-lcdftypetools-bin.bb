SUMMARY = "Binary files of lcdftypetools"
DESCRIPTION = "Binary files of lcdftypetools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-lcdftypetools-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "60bc2f5937ad23bc4ec9a12ba6a5018ad56a9bde3983c1b60b4f3950504f8594410cd86f8f819bc0d3bd5a1c9dff62565ab44d4ee43c9965d2914239880c3eb7"

RPROVIDES:${PN} += "texlive-lcdftypetools-bin \
texlive-lcdftypetools-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
texlive-lcdftypetools"

inherit rpm
