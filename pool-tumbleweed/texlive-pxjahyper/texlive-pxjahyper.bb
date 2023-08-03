SUMMARY = "Hyperref support for pLaTeX"
DESCRIPTION = "This package adjusts the behavior of hyperref on (u)pLaTeX so \
that authors can properly create PDF documents that contain \
document information in Japanese."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn66272"

RPM_NAME = "texlive-pxjahyper-2023.209.1.3svn66272-54.1.noarch.rpm"
RPM_HASH = "4d45a9fbb07cc0d49cf99a5e03ad66c380a97b8297f1fb2246d5d3f83f255344a4b1890f059722c1aa9fc8850b3e19e697c8c608e065a0e15d4dbaaf4dcf322c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxjahyper-ajm.def \
tex-pxjahyper-enc.sty \
tex-pxjahyper-uni.def \
tex-pxjahyper.sty \
texlive-pxjahyper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-bxjatoucs.sty \
tex-etoolbox.sty \
tex-keyval.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
