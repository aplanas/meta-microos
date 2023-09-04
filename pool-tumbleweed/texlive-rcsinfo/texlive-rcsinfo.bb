SUMMARY = "Support for the revision control system"
DESCRIPTION = "A package to extract RCS (Revision Control System) information \
and use it in a LaTeX document. For users of LaTeX2HTML \
rcsinfo.perl is included."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-2023.209.1.11svn15878-54.2.noarch.rpm"
RPM_HASH = "3dae16a76d3372ee1a99e385ebaff15a86de6fe58aba113440bc01acbfbb3f0ec023134b3976defeb844241c198644c746fe19b22513c45a36a9451edf713786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rcsinfo.cfg \
tex-rcsinfo.sty \
texlive-rcsinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
