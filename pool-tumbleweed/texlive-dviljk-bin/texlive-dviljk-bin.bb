SUMMARY = "Binary files of dviljk"
DESCRIPTION = "Binary files of dviljk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviljk-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "1acda2b744e271356d0ecb3312914423727085268fb57acbea551c15e06288b8d92564aed77413edefe9e48ef8eddffced012d6a94aaf06c52e3d022fe9de33c"

RPROVIDES:${PN} += "texlive-bin-dvilj \
texlive-dviljk-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dviljk"

inherit rpm
