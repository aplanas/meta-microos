SUMMARY = "Technical dimension lines using PGF/TikZ"
DESCRIPTION = "tikz-dimline helps drawing technical dimension lines in TikZ \
picture environments. Its usage is similar to some \
contributions posted on stackexchange."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35805"

RPM_NAME = "texlive-tikz-dimline-2023.201.1.0svn35805-52.1.noarch.rpm"
RPM_HASH = "b77a8f80f9b8f68ee82b6ab38d0c1ad33e25610316ee233d52ddce63415704f0a7107e856d4fab6a2e8d88698854138c33ac33e056365d48fe33b39de59002da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-dimline.sty \
texlive-tikz-dimline"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgfplots.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
