SUMMARY = "Identify draft copies"
DESCRIPTION = "Places the word DRAFT (or other words) in light grey diagonally \
across the background (or at the bottom) of each (or selected) \
pages of the document. The package uses PostScript \\special \
commands, and may not therefore be used with pdfLaTeX. For that \
usage, consider the wallpaper or draftwatermark packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.16svn15878"

RPM_NAME = "texlive-draftcopy-2023.209.2.16svn15878-53.1.noarch.rpm"
RPM_HASH = "193235aeb829b525bc402e6916b97c00658a7e8733c6bae9d28e54791f8d078c40911e11b1f6793818a29cc179b5fdf510afe6e009e06bdf1e3bf4374c2a015f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-draftcopy.cfg \
tex-draftcopy.sty \
texlive-draftcopy"

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
