SUMMARY = "Binary files of aleph"
DESCRIPTION = "Binary files of aleph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-aleph-bin-2023.20230311.svn66084-93.2.aarch64.rpm"
RPM_HASH = "8878b7fef4d9e99035a8c99b785921d05ba73753c6657f542a8302a6f88008eecc631b37189661ce24a62f7d5812486cb575119cafb3da87cae242c59f40cf61"

RPROVIDES:${PN} += "texlive-aleph-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-aleph"

inherit rpm
