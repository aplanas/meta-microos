SUMMARY = "Find difference between two PDF's"
DESCRIPTION = "Find difference between two PDF's"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn37946"

RPM_NAME = "texlive-pdfpagediff-2023.209.1.4svn37946-52.1.noarch.rpm"
RPM_HASH = "55050af2f6ca7fa8cd530c8bd43263b56c30c11c3fc926217077327860ae5f92ab79005827bf8c075eb7d00c9e275e6eb3b714765d29f15878a1c9451c4ddd34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfpagediff.sty \
texlive-pdfpagediff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-substr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
