SUMMARY = "Extended book class"
DESCRIPTION = "The class extends the standard book class, in the areas of \
colour scheme management, document layout, headings and \
footers, front page layout, and other minor items."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-bookest-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "423f4ae6fab9a0fde45478f148c63ad9219ecd828ac06ea0c5fe2981da992a2164e8fa6866a71d9df51c34081581e993358bf9db6ba23a6389444a13858c8020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookest.cls \
texlive-bookest"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-color.sty \
tex-eso-pic.sty \
tex-everyshi.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
