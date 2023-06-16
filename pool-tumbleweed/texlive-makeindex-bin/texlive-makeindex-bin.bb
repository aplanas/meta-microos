SUMMARY = "Binary files of makeindex"
DESCRIPTION = "Binary files of makeindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-makeindex-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "ac8b12bcb160c281cee32a79a3a3282abcaee63b79694c94e8c035a56dd0db9748a7cf38a6238e96b4e28f590d97a2c72ef710d02e42100fb82928fec6a1c480"

RPROVIDES:${PN} += "texlive-makeindex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-makeindex"

inherit rpm
