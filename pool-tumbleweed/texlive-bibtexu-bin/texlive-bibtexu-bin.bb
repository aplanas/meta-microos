SUMMARY = "Binary files of bibtexu"
DESCRIPTION = "Binary files of bibtexu"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtexu-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "186c8742e456e67a65398da386df3ff874cf8afc33c8f67b034f67c2fa89cb4c674e8f247d28545e204c28f2f25b3c2b3cb8b1255a7c6f677130f7c18718d728"

RPROVIDES:${PN} += "texlive-bibtexu-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libkpathsea.so.6 \
texlive-bibtexu"

inherit rpm
