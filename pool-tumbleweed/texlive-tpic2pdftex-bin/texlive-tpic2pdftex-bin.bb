SUMMARY = "Binary files of tpic2pdftex"
DESCRIPTION = "Binary files of tpic2pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50281"

RPM_NAME = "texlive-tpic2pdftex-bin-2023.20230311.svn50281-93.2.aarch64.rpm"
RPM_HASH = "21058808ddc8f4df0e9a9676d5cf3be54cabf1c73a81a47ad5fe0f9ae0451c32de90e56f84039384ea5fe7ab8cfdf00c205ba1004350fe59dc644c008d6c41cb"

RPROVIDES:${PN} += "texlive-tpic2pdftex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
texlive-tpic2pdftex"

inherit rpm
