SUMMARY = "Grid, a.k.a. in-register, setting"
DESCRIPTION = "Grid setting -- also known as strict in-register setting -- is \
something, that should be done for a lot of documents but is \
not easy using LaTeX. The package helps to get the information \
needed for grid setting. It does not implement auto grid \
setting, but there is a command \\vskipnextgrid, that moves to \
the next grid position. This may be enough under some \
circumstances, but in other circumstances it may fail. Thus \
gridset is only one more step for grid setting, not a complete \
solution."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn53762"

RPM_NAME = "texlive-gridset-2023.209.0.0.3svn53762-54.2.noarch.rpm"
RPM_HASH = "40387c6702925e6ce5f8469adf963d3905ae2281e422027560547ceb3bed641b504573b674a7858f0859520d8c6e0679a491bf9062b8cd91d08679114f690a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridset.sty \
texlive-gridset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
