SUMMARY = "Binary files of makeindex"
DESCRIPTION = "Binary files of makeindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-makeindex-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "be6cf35b9621a9f1cabc03c6c1bd456f6fea004b9ed8330614e74aa47243e86ce77b1b1b7403f880a27485294d715ec613df0b03b232a4d503a29bd8a3b04553"

RPROVIDES:${PN} += "texlive-makeindex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-makeindex"

inherit rpm
