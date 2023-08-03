SUMMARY = "BibLaTeX stylefiles for software products"
DESCRIPTION = "This package implements software entry types for BibLaTeX in \
the form of a bibliography style extension. It requires the \
Biber backend."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2_5svn64030"

RPM_NAME = "texlive-biblatex-software-2023.209.1.2_5svn64030-54.1.noarch.rpm"
RPM_HASH = "e4282fb231a9b42b398c8ae9faaa0329921f092741a7098179df7f69f1293656d26de39dcc20fbae8d408a441617307d421e3d0fb69b55222bab595a6b87c618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-english-software.lbx \
tex-french-software.lbx \
tex-software-biblatex.sty \
tex-software.bbx \
texlive-biblatex-software"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-english.lbx \
tex-french.lbx \
tex-xurl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
