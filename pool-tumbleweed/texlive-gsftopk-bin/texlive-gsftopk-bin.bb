SUMMARY = "Binary files of gsftopk"
DESCRIPTION = "Binary files of gsftopk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gsftopk-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "71a5054d47cf00f1e35eb9ab20be410a1f27a96e18e7d9c8cc3621c6667ce4131771b7d93c25e143fa4443f49aa448c8500612abcd6bb3cef9137d8806824870"

RPROVIDES:${PN} += "texlive-gsftopk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-gsftopk"

inherit rpm
