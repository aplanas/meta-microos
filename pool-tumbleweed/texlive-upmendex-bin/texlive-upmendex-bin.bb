SUMMARY = "Binary files of upmendex"
DESCRIPTION = "Binary files of upmendex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-upmendex-bin-2023.20230311.svn66511-93.1.aarch64.rpm"
RPM_HASH = "ebae5a7d06640e39c69988ca6797fa070f7f3853619e2bc17fcccf7ef6eb3cc4c828258f3e3844db896893da9ed46dc14478e88b6d612c7d9b2fe4113a60b779"

RPROVIDES:${PN} += "texlive-upmendex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libkpathsea.so.6 \
texlive-upmendex"

inherit rpm
