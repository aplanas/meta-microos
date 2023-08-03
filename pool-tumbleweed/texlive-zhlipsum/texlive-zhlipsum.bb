SUMMARY = "Chinese dummy text"
DESCRIPTION = "This package provides an interface to dummy text in Chinese \
language, which will be useful for testing Chinese documents. \
UTF-8, GBK and Big5 encodings are supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-2023.209.1.2.0svn54994-53.1.noarch.rpm"
RPM_HASH = "b45783ba26df15e8c10a94cd11de42b7e1feafa2a6357efe57af722b43e8d6e7f513aad1ec239dfde5644247b7c8ad4f006fd890f56c858dae8eb4458c7c7331"
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
