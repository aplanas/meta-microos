SUMMARY = "Poor man ISO math for pdfLaTeX users"
DESCRIPTION = "This small package realizes a poor man approximation of the ISO \
regulations for physical sciences and technology. Contrary to \
other more elegant solutions, it does not load any math \
alphabet, since pdfLaTeX can use only a maximum of such \
alphabets. The necessary user macros are defined for typsetting \
common math symbols that require special ISO treatment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.00svn60368"

RPM_NAME = "texlive-pm-isomath-2023.209.1.2.00svn60368-53.1.noarch.rpm"
RPM_HASH = "cb3d096abe1dd458f808127ce779a35e79ec18b0a902d770a5614ea9586376703ceaeb45a02beb3eebb81158ca5029cf7163829783a6749697faebee99ea48ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pm-isomath.sty \
texlive-pm-isomath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabeta.sty \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-iftex.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
