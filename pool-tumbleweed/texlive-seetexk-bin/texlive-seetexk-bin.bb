SUMMARY = "Binary files of seetexk"
DESCRIPTION = "Binary files of seetexk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-seetexk-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "a3596f6b5a330e5505d48abe3c2e19a1243446103130e9a3b6003451f95b2014fc0e713107868ac38ff8c85901abe81996f2801b0a12db73c57ab8e479dda5b6"

RPROVIDES:${PN} += "texlive-seetexk-bin"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-seetexk"

inherit rpm
