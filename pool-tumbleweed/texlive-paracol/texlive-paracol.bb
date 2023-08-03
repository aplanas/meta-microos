SUMMARY = "Multiple columns with texts 'in parallel'"
DESCRIPTION = "The package provides yet another multi-column typesetting \
mechanism by which you produce multi-column (e.g., bilingual) \
document switching and sychronizing each corresponding part in \
'parallel'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.35svn49560"

RPM_NAME = "texlive-paracol-2023.209.1.35svn49560-52.1.noarch.rpm"
RPM_HASH = "d35433159839646e1c3632b7e1e7ba426c3d305ccee4666d48846850c587e01506b4875d6471f03dbf6e94a513e8805e824c87a0204eb73fc3604b1d359ae5d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paracol.sty \
texlive-paracol"

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
