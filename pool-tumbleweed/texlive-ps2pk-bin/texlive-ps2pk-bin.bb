SUMMARY = "Binary files of ps2pk"
DESCRIPTION = "Binary files of ps2pk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ps2pk-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "d3c5d015f42bc0ded116cf41c59990aded25092337d8d27dd38f7515a23211b786d6203b789465ace02ecd05f13d281ced36cd1676a14a25dd9dc14ad13bb806"

RPROVIDES:${PN} += "texlive-ps2pk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ps2pk"

inherit rpm
