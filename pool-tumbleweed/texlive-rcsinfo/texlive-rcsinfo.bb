SUMMARY = "Support for the revision control system"
DESCRIPTION = "A package to extract RCS (Revision Control System) information \
and use it in a LaTeX document. For users of LaTeX2HTML \
rcsinfo.perl is included."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-2023.209.1.11svn15878-54.1.noarch.rpm"
RPM_HASH = "13495dc852d8462f3274af114c0a2a060a2963a75c87035052cf79d20b59f97bc756a5103d005ed59a38156488a9956b09c7974fb56b12f1b3b4bf8fa65fb2d4"
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
