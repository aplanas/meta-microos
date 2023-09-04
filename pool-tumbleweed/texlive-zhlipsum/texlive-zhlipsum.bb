SUMMARY = "Chinese dummy text"
DESCRIPTION = "This package provides an interface to dummy text in Chinese \
language, which will be useful for testing Chinese documents. \
UTF-8, GBK and Big5 encodings are supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-2023.209.1.2.0svn54994-53.2.noarch.rpm"
RPM_HASH = "6a491049fefb7aba41ecf6d2b06581baa53ac8f74acdccdbd0f9f775017c2f21839d3967d86d2434aa196fc9526bdde9364cbaa1bafe66316184b38cd47d1fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zhlipsum-big5.def \
tex-zhlipsum-gbk.def \
tex-zhlipsum-utf8.def \
tex-zhlipsum.sty \
texlive-zhlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
